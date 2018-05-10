package ir.omidtaheri.wpclient.ui.search;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.EndlessRecycleView.PaginationScrollListener;
import ir.omidtaheri.wpclient.ui.base.BaseActivity;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductActivity;


public class SearchActivity extends BaseActivity implements SearchMvpView, SearchRecyclerAdapter.Callback {

    @Inject
    SearchMvpPresenter<SearchMvpView> mPresenter;


    SearchRecyclerAdapter adapter;
    @BindView(R.id.post_list)
    RecyclerView post_List;
    @BindView(R.id.main_progress)
    ProgressBar mainProgress;
    @BindView(R.id.errore_text)
    TextView erroreText;
    @BindView(R.id.error_btn_retry)
    Button errorBtnRetry;
    @BindView(R.id.error_layout)
    ConstraintLayout errorLayout;


    // Index from which pagination should start (0 is 1st page in our case)
    private static final int PAGE_START = 1;
    @BindView(R.id.searchView)
    SearchView searchView;


    // Indicates if footer ProgressBar is shown (i.e. next page is loading)
    private boolean isLoading = false;
    // If current page is the last page (Pagination will stop after this page load)
    private boolean isLastPage = false;
    // total no. of pages to load. Initial load is page 0, after which 2 more pages will load.
    private int TOTAL_PAGES = 0;
    // indicates the current page which Pagination is fetching.
    private int currentPage = PAGE_START;


    public static Intent getStartIntent(Context context, int id) {
        Intent intent = new Intent(context, SearchActivity.class);
        intent.putExtra("category_id", id);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(this);

        setUp();


        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        // Assumes current activity is the searchable activity
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false); // Do not iconify the widget; expand it by default
        searchView.setSubmitButtonEnabled(false);
        searchView.setQueryRefinementEnabled(true);


        handleIntent(getIntent());

    }

    @Override
    protected void setUp() {

    }


    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    private void doMySearch(String query) {
        System.out.println("query: " + query);
        mPresenter.search(query);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
        setIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            searchView.setQuery(query, false);
            doMySearch(query);
        } else {
            int category_id = getIntent().getExtras().getInt("category_id");
            System.out.println("category_id " + category_id);
            mPresenter.getCategoriePosts(category_id);
        }
    }





    @Override
    public void sucssed_load_first_page(List<PostsResponse> list) {
        mainProgress.setVisibility(View.GONE);

        if (currentPage <= TOTAL_PAGES && TOTAL_PAGES != 1) adapter.addLoadingFooter();
        else isLastPage = true;
    }

    @Override
    public void errore_load_first_page(int message, final String query) {
        if (errorLayout.getVisibility() == View.GONE) {
            errorLayout.setVisibility(View.VISIBLE);
            mainProgress.setVisibility(View.GONE);


            erroreText.setText(getResources().getString(message));


        }

        errorBtnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorLayout.setVisibility(View.GONE);
                mainProgress.setVisibility(View.VISIBLE);

                mPresenter.search(query);
            }
        });

    }

    @Override
    public void error_load_first_page_for_category(int message, final int category_id) {
        if (errorLayout.getVisibility() == View.GONE) {
            errorLayout.setVisibility(View.VISIBLE);
            mainProgress.setVisibility(View.GONE);

            erroreText.setText(getResources().getString(message));

        }

        errorBtnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                errorLayout.setVisibility(View.GONE);
                mainProgress.setVisibility(View.VISIBLE);
                mPresenter.getCategoriePosts(category_id);
            }
        });
    }


    @Override
    public void sucssed_load_next_page(List<PostsResponse> list) {
        adapter.removeLoadingFooter();
        isLoading = false;

        adapter.addAll(list);

        if (currentPage != TOTAL_PAGES) adapter.addLoadingFooter();
        else isLastPage = true;
    }

    @Override
    public void errore_load_next_page(String query, int page, int error_message) {
        adapter.showRetryForSearch(true, getResources().getString(error_message), query, page);
    }


    @Override
    public void error_load_next_page_for_category(int category_id, int page, int error_message) {
        adapter.showRetryForCategory(true, getResources().getString(error_message), category_id, page);

    }


    @Override
    public void SetTotalPage(int total_page) {
        this.TOTAL_PAGES = total_page;
    }

    @Override
    public int GetTotalPage() {
        return TOTAL_PAGES;
    }


    @Override
    public void setupList(List<PostsResponse> items_list, final int category_id) {


        List<PostsResponse> items = items_list;

        adapter = new SearchRecyclerAdapter(items, this);
        adapter.setCallback(this);


        post_List.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        post_List.setLayoutManager(layoutManager);

        post_List.addOnScrollListener(new PaginationScrollListener(layoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPage += 1;
                mPresenter.loadNextPage(currentPage, category_id);

            }

            @Override
            public int getTotalPageCount() {
                return TOTAL_PAGES;
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });

        if (items_list != null && items_list.size() > 0) {
            sucssed_load_first_page(items_list);
        } else {
           mainProgress.setVisibility(View.GONE);
        }
    }


    @Override
    public void setupListofSearch(List<PostsResponse> items_list, final String query) {


        List<PostsResponse> items = items_list;

        adapter = new SearchRecyclerAdapter(items, this);
        adapter.setCallback(this);


        post_List.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        post_List.setLayoutManager(layoutManager);

        post_List.addOnScrollListener(new PaginationScrollListener(layoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPage += 1;
                mPresenter.loadNextPageofsearch(currentPage, query);

            }

            @Override
            public int getTotalPageCount() {
                return TOTAL_PAGES;
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });

        if (items_list != null && items_list.size() > 0) {
            sucssed_load_first_page(items_list);
        } else {
            mainProgress.setVisibility(View.GONE);
        }
    }


    @Override
    public void onItemClick(PostsResponse item) {
        startActivity(DetailProductActivity.getStartIntent(this, item));
    }

    @Override
    public void retryPageLoadForCategory(int category_id, int page) {
        mPresenter.loadNextPage(page, category_id);
    }

    @Override
    public void retryPageLoadForSearch(String query, int page) {
        mPresenter.loadNextPageofsearch(page, query);
    }
}
