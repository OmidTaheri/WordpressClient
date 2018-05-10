
package ir.omidtaheri.wpclient.ui.detailpage;


import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.MvpView;



public interface DetailProductMvpView extends MvpView {


    void loadPoastData(PostsResponse item);


}
