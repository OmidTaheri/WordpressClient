
package ir.omidtaheri.wpclient.ui.detailpage;


import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.di.PerActivity;
import ir.omidtaheri.wpclient.ui.base.MvpPresenter;


@PerActivity
public interface DetailProductMvpPresenter<V extends DetailProductMvpView> extends MvpPresenter<V> {




    void showPost(PostsResponse item);
}
