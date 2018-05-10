
package ir.omidtaheri.wpclient.ui.search;


import ir.omidtaheri.wpclient.di.PerActivity;
import ir.omidtaheri.wpclient.ui.base.MvpPresenter;



@PerActivity
public interface SearchMvpPresenter<V extends SearchMvpView> extends MvpPresenter<V> {


    void getCategoriePosts(int category_id);

    void loadFirstPage(int page,int category_id);

    void loadNextPage(int page,int category_id);

    void search(String query);

    void loadFirstPageofsearch(int page,String query);

    void loadNextPageofsearch(int page,String query);


}
