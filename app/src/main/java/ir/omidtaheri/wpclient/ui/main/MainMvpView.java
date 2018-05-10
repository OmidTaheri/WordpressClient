
package ir.omidtaheri.wpclient.ui.main;


import java.util.List;

import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.MvpView;



public interface MainMvpView extends MvpView {

    void showSearchActivity();

    void showCategoriesActivity();

    void setupList(List<PostsResponse> items_list);

    void sucssed_load_first_page(List<PostsResponse> list);

    void errore_load_first_page(int message );

    void sucssed_load_next_page(List<PostsResponse> list);

    void errore_load_next_page( int page, int message);

    void SetTotalPage(int total_page);

    int GetTotalPage();

    void  closeNavigationDrawer();


}
