
package ir.omidtaheri.wpclient.ui.main;


import ir.omidtaheri.wpclient.di.PerActivity;
import ir.omidtaheri.wpclient.ui.base.MvpPresenter;

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void onToolbarSearchClick();

    void onDrawerCategoriesClick();

    void loadFirstPage(int page);

    void loadNextPage(int page);
}
