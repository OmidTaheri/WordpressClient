package ir.omidtaheri.wpclient.ui.category;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.network.model.Categories.CategoriesResponse;
import ir.omidtaheri.wpclient.ui.base.BaseActivity;
import ir.omidtaheri.wpclient.ui.search.SearchActivity;


public class CategoryActivity extends BaseActivity implements CategoryMvpView,CategoryRecyclerAdapter.Callback {


    @Inject
    CategoryMvpPresenter<CategoryMvpView> mPresenter;


    @BindView(R.id.category_list)
    RecyclerView category_list;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, CategoryActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(this);

        setUp();
    }

    @Override
    protected void setUp() {

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mPresenter.getCategoriesList();


    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }


    @Override
    public void setupList(List<CategoriesResponse> items_list) {
        List<CategoriesResponse> items = items_list;


        CategoryRecyclerAdapter adapter = new CategoryRecyclerAdapter(items, this);
        adapter.setCallback(this);

        category_list.setAdapter(adapter);

        category_list.setFocusable(false);

        category_list.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void showSearchActivity(int id) {
        startActivity(SearchActivity.getStartIntent(this,id));
    }

    @Override
    public void onItemClick(int id) {
        mPresenter.showSearchActivity( id);
    }
}
