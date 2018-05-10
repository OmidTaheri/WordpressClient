
package ir.omidtaheri.wpclient.ui.splash;


import ir.omidtaheri.wpclient.di.PerActivity;
import ir.omidtaheri.wpclient.ui.base.MvpPresenter;



@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void delayToNextActivity();

}
