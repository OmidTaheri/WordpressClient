
package ir.omidtaheri.wpclient.ui.search;


import java.util.List;

import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.MvpView;


public interface SearchMvpView extends MvpView {


    void sucssed_load_first_page(List<PostsResponse> list);

    void errore_load_first_page(int message, String query);

    void error_load_first_page_for_category(int message, int category_id);

    void sucssed_load_next_page(List<PostsResponse> list);

    void errore_load_next_page(String query, int page, int error_message);

    void error_load_next_page_for_category(int category_id, int page, int error_message);

    void SetTotalPage(int total_page);

    int GetTotalPage();

    void setupList(List<PostsResponse> items_list, int category_id);

    void setupListofSearch(List<PostsResponse> items_list, String query);


}
