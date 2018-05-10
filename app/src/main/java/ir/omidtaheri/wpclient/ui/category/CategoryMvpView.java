
package ir.omidtaheri.wpclient.ui.category;


import java.util.List;

import ir.omidtaheri.wpclient.data.network.model.Categories.CategoriesResponse;
import ir.omidtaheri.wpclient.ui.base.MvpView;



public interface CategoryMvpView extends MvpView {

    void setupList( List<CategoriesResponse> items_list);
    void showSearchActivity(int id);


}
