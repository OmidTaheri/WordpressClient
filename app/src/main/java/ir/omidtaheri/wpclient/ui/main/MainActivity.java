
package ir.omidtaheri.wpclient.ui.main;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.EndlessRecycleView.PaginationScrollListener;
import ir.omidtaheri.wpclient.ui.base.BaseActivity;
import ir.omidtaheri.wpclient.ui.category.CategoryActivity;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductActivity;
import ir.omidtaheri.wpclient.ui.search.SearchActivity;


public class MainActivity extends BaseActivity implements MainMvpView, PostRecyclerAdapter.Callback {

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;


    Drawer mDrawer;

    @BindView(R.id.post_list)
    RecyclerView post_list;


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

    PostRecyclerAdapter adapter;
    // Indicates if footer ProgressBar is shown (i.e. next page is loading)
    private boolean isLoading = false;
    // If current page is the last page (Pagination will stop after this page load)
    private boolean isLastPage = false;
    // total no. of pages to load. Initial load is page 0, after which 2 more pages will load.
    private int TOTAL_PAGES = 0;
    // indicates the current page which Pagination is fetching.
    private int currentPage = PAGE_START;


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        }
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(this);

        setUp();
    }


    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);


        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        final SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        // Assumes current activity is the searchable activity
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false); // Do not iconify the widget; expand it by default
        searchView.setSubmitButtonEnabled(false);
        searchView.setQueryRefinementEnabled(true);
        return super.onCreateOptionsMenu(menu);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    // This activity is NOT part of this app's task, so create a new task
                    // when navigating up, with a synthesized back stack.
                    TaskStackBuilder.create(this)
                            // Add all of this activity's parents to the back stack
                            .addNextIntentWithParentStack(upIntent)
                            // Navigate up to the closest parent
                            .startActivities();
                } else {
                    // This activity is part of this app's task, so simply
                    // navigate up to the logical parent activity.
                    NavUtils.navigateUpTo(this, upIntent);
                }
                return true;


            case R.id.action_search:
                //  openShareApkDialog();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    protected void setUp() {

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawer = setupNavDrawer(MainActivity.this, mToolbar);
        mPresenter.loadFirstPage(1);

    }

    @Override
    public void setupList(List<PostsResponse> items_list) {


        List<PostsResponse> items = items_list;

        adapter = new PostRecyclerAdapter(items, this);
        adapter.setCallback(this);


        post_list.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        post_list.setLayoutManager(layoutManager);

        post_list.addOnScrollListener(new PaginationScrollListener(layoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPage += 1;
                mPresenter.loadNextPage(currentPage);

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
    public void sucssed_load_first_page(List<PostsResponse> list) {
        mainProgress.setVisibility(View.GONE);


        if (currentPage <= TOTAL_PAGES) adapter.addLoadingFooter();
        else isLastPage = true;
    }

    @Override
    public void errore_load_first_page(int message) {
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

                mPresenter.loadFirstPage(1);
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
    public void errore_load_next_page(int page, int error_message) {
        adapter.showRetry(true, getResources().getString(error_message), page);
    }

    @Override
    public void SetTotalPage(int total_page) {
        this.TOTAL_PAGES = total_page;
    }

    @Override
    public int GetTotalPage() {
        return TOTAL_PAGES;
    }


    public Drawer setupNavDrawer(final Activity activity, Toolbar toolbar) {

        // Create the AccountHeader
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(activity)
                .withHeaderBackground(R.drawable.header)
                .build();


        PrimaryDrawerItem drawerItem_home = new PrimaryDrawerItem().withIdentifier(0)
                .withName(R.string.home_drawer).withIcon(R.drawable.home_inactive);


        PrimaryDrawerItem drawerItem_categoreis = new PrimaryDrawerItem().withIdentifier(1)
                .withName(R.string.categoreis_drawer).withIcon(R.drawable.filter);


        //create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withAccountHeader(headerResult)
                .withActionBarDrawerToggleAnimated(true)
                .withCloseOnClick(true)
                .withSelectedItem(0)
                .addDrawerItems(
                        drawerItem_home,
                        drawerItem_categoreis

                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem.getIdentifier() == 1) {
                            mPresenter.onDrawerCategoriesClick();
                            return true;
                        }
                        return false;
                    }
                })
                .withDrawerGravity(Gravity.RIGHT)
                .build();

        return result;
    }


    @Override
    public void showSearchActivity() {
        startActivity(SearchActivity.getStartIntent(this, 12));
    }


    @Override
    public void showCategoriesActivity() {
        startActivity(CategoryActivity.getStartIntent(this));
    }


    @Override
    public void closeNavigationDrawer() {
        if (mDrawer != null) {
            mDrawer.closeDrawer();
        }
    }

    @Override
    public void onItemClick(PostsResponse item) {
        startActivity(DetailProductActivity.getStartIntent(this, item));
    }

    @Override
    public void retryPageLoad(int page) {
        mPresenter.loadNextPage(page);
    }

    @Override
    public boolean onSearchRequested() {

        Bundle appData = new Bundle();
        appData.putBoolean("B1", true);
        startSearch(null, false, appData, false);
        return super.onSearchRequested();


    }
}
