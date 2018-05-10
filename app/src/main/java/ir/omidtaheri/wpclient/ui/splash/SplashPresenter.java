
package ir.omidtaheri.wpclient.ui.splash;

import java.util.concurrent.TimeUnit;

import io.reactivex.Maybe;
import io.reactivex.functions.Action;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.ui.base.BasePresenter;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;



public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V> {

    @Inject
    public SplashPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

    }

    @Override
    public void delayToNextActivity() {
        Maybe.empty() // returns maybe instance that calls onComplete right away
                .delay(4, TimeUnit.SECONDS) // posting delay of 3 seconds
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnComplete(new Action() {
                    @Override
                    public void run() throws Exception {
                        getMvpView().launchMainActivity();

                    }
                })
                .subscribe();
    }
}
