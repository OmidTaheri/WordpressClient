package ir.omidtaheri.wpclient.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.BaseViewHolder;


public class PostRecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    public static final int VIEW_TYPE_EMPTY = 0;
    public static final int VIEW_TYPE_NORMAL = 1;
    private static final int LOADING = 2;


    private List<PostsResponse> list;
    private Context mContext;
    private Callback mCallback;


    private boolean isLoadingAdded = false;
    private boolean retryPageLoad = false;
    private String errorMsg;

    int errored_page;

    public PostRecyclerAdapter(List<PostsResponse> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    public void setCallback(Callback callback) {
        mCallback = callback;
    }


    private Context getContext() {
        return mContext;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        switch (viewType) {

            case VIEW_TYPE_NORMAL:
                return new ViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_post, parent, false));


            case LOADING:
                return new LoadingViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_progress, parent, false));


            case VIEW_TYPE_EMPTY:
            default:
                return new EmptyViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empty_view, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }


    @Override
    public int getItemCount() {
        if (list != null && list.size() != 0) {
            return list.size();
        } else {
            return 1;
        }
    }


    public void addItems(List<PostsResponse> repoList) {
        list.addAll(repoList);
        notifyDataSetChanged();
    }

    public interface Callback {
        void onItemClick(PostsResponse item);

        void retryPageLoad( int page);
    }

    @Override
    public int getItemViewType(int position) {
        if (list != null && list.size() > 0) {
            return (position == list.size() - 1 && isLoadingAdded) ? LOADING : VIEW_TYPE_NORMAL;
        } else {
            return VIEW_TYPE_EMPTY;
        }
    }

      /*
   Helpers
   _________________________________________________________________________________________________
    */

    public void add(PostsResponse mc) {
        list.add(mc);
        notifyItemInserted(list.size() - 1);
    }

    public void addAll(List<PostsResponse> List) {
        for (PostsResponse item : List) {
            add(item);
        }
    }

    public void remove(PostsResponse item) {
        int position = list.indexOf(item);
        if (position > -1) {
            list.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        isLoadingAdded = false;
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }


    public void addLoadingFooter() {
        isLoadingAdded = true;
        add(new PostsResponse());
    }

    public void removeLoadingFooter() {
        isLoadingAdded = false;

        int position = list.size() - 1;
        PostsResponse item = getItem(position);

        if (item != null) {
            list.remove(position);
            notifyItemRemoved(position);
        }
    }

    public PostsResponse getItem(int position) {
        return list.get(position);
    }

    public void showRetry(boolean show, @Nullable String errorMsg, int page) {
        errored_page = page;

        retryPageLoad = show;
        notifyItemChanged(list.size() - 1);

        if (errorMsg != null) this.errorMsg = errorMsg;
    }


    public class ViewHolder extends BaseViewHolder {

        @BindView(R.id.author_image)
        ImageView authorImage;

        @BindView(R.id.post_image)
        ImageView postImage;
        @BindView(R.id.post_title)
        TextView postTitle;
        @BindView(R.id.post_text)
        TextView postText;
        @BindView(R.id.Read_more)
        TextView Read_more;
        @BindView(R.id.date)
        TextView date;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {

        }

        @Override
        public void onBind(int position) {
            super.onBind(position);

            final PostsResponse item = list.get(position);


            Glide.with(itemView.getContext())
                    .load(item.getFeaturedImageSrc())
                    .placeholder(R.drawable.placeholder)
                    .into(postImage);


            postTitle.setText(item.getTitle().getRendered());
            postText.setText(Html.fromHtml(item.getExcerpt().getRendered()).toString());
            date.setText(item.getDate().split("T")[0]);


            Read_more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCallback != null) {
                        mCallback.onItemClick(item);
                    }
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCallback != null) {
                        mCallback.onItemClick(item);
                    }


                }
            });
        }
    }

    public class EmptyViewHolder extends BaseViewHolder {
        @BindView(R.id.message)
        TextView message;

        public EmptyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {

        }

        @Override
        public void onBind(int position) {
            super.onBind(position);
            message.setText("موردی وجود ندارد");
        }
    }


    public class LoadingViewHolder extends BaseViewHolder implements View.OnClickListener {

        @BindView(R.id.loadmore_progress)
        ProgressBar mProgressBar;
        @BindView(R.id.loadmore_retry)
        Button mRetryBtn;
        @BindView(R.id.loadmore_errortxt)
        TextView mErrorTxt;
        @BindView(R.id.loadmore_errorlayout)
        ConstraintLayout mErrorLayout;

        public LoadingViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            mRetryBtn.setOnClickListener(this);

        }

        @Override
        protected void clear() {

        }

        public void onBind(int position) {
            super.onBind(position);

            if (retryPageLoad) {
                this.mErrorLayout.setVisibility(View.VISIBLE);
                this.mProgressBar.setVisibility(View.GONE);

                if (errorMsg.length() != 0) {
                    mErrorTxt.setText(errorMsg);
                } else {
                    mErrorTxt.setText("خطا در دریافت اطلاعات");
                }

            } else {
                this.mErrorLayout.setVisibility(View.GONE);
                this.mProgressBar.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.loadmore_retry:

                    mCallback.retryPageLoad(errored_page);
                    showRetry(false, null, 0 );
                    break;
            }
        }
    }
}