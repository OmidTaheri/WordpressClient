
package ir.omidtaheri.wpclient.ui.category;


import ir.omidtaheri.wpclient.di.PerActivity;
import ir.omidtaheri.wpclient.ui.base.MvpPresenter;


@PerActivity
public interface CategoryMvpPresenter<V extends CategoryMvpView> extends MvpPresenter<V> {


    void getCategoriesList();

    void  showSearchActivity(int id);



}
