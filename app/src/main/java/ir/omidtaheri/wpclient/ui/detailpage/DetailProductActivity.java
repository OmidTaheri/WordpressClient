package ir.omidtaheri.wpclient.ui.detailpage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostCategory;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.BaseActivity;


public class DetailProductActivity extends BaseActivity implements DetailProductMvpView {


    @Inject
    DetailProductMvpPresenter<DetailProductMvpView> mPresenter;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.post_image)
    ImageView postImage;
    @BindView(R.id.post_title)
    TextView postTitle;
    @BindView(R.id.post_context)
    TextView postContext;

    @BindView(R.id.tags_title)
    TextView tagsTitle;
    @BindView(R.id.tags_context)
    TextView tagsContext;


    public static Intent getStartIntent(Context context, PostsResponse item) {
        Intent intent = new Intent(context, DetailProductActivity.class);

        intent.putExtra("Item", item);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);


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
    protected void setUp() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        PostsResponse item = getIntent().getExtras().getParcelable("Item");
        mPresenter.showPost(item);

    }


    @Override
    public void loadPoastData(PostsResponse item) {

        Glide.with(this)
                .load(item.getFeaturedImageSrc())
                .centerCrop()
                .into(postImage);

        postContext.setText(Html.fromHtml(item.getContent().getRendered()));
        postTitle.setText(item.getTitle().getRendered());

        List<PostCategory> postCategories = item.getPostCategories();

        StringBuilder tags = new StringBuilder();

        for (int i = 0; i < postCategories.size(); i++) {

            tags.append(postCategories.get(i).getName());

            if (i != postCategories.size() - 1) {
                tags.append(" , ");
            }

        }

        tagsContext.setText(tags.toString());

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


            default:
                return super.onOptionsItemSelected(item);
        }


    }

}
