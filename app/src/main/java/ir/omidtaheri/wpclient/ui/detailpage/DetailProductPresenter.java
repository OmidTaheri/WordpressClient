package ir.omidtaheri.wpclient.ui.detailpage;


import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.BasePresenter;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;


public class DetailProductPresenter<V extends DetailProductMvpView> extends BasePresenter<V>
        implements DetailProductMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public DetailProductPresenter(DataManager dataManager,
                                  SchedulerProvider schedulerProvider,
                                  CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }




    @Override
    public void showPost(PostsResponse item) {
        getMvpView().loadPoastData(item);
    }

}
