
package ir.omidtaheri.wpclient.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import ir.omidtaheri.wpclient.di.ActivityContext;
import ir.omidtaheri.wpclient.di.PerActivity;


import ir.omidtaheri.wpclient.ui.category.CategoryMvpPresenter;
import ir.omidtaheri.wpclient.ui.category.CategoryMvpView;
import ir.omidtaheri.wpclient.ui.category.CategoryPresenter;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductMvpPresenter;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductMvpView;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductPresenter;
import ir.omidtaheri.wpclient.ui.main.MainMvpPresenter;
import ir.omidtaheri.wpclient.ui.main.MainMvpView;
import ir.omidtaheri.wpclient.ui.main.MainPresenter;
import ir.omidtaheri.wpclient.ui.search.SearchMvpPresenter;
import ir.omidtaheri.wpclient.ui.search.SearchMvpView;
import ir.omidtaheri.wpclient.ui.search.SearchPresenter;
import ir.omidtaheri.wpclient.ui.splash.SplashMvpPresenter;
import ir.omidtaheri.wpclient.ui.splash.SplashMvpView;
import ir.omidtaheri.wpclient.ui.splash.SplashPresenter;
import ir.omidtaheri.wpclient.utils.rx.AppSchedulerProvider;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;


@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    SearchMvpPresenter<SearchMvpView> provideSearchPresenter(
            SearchPresenter<SearchMvpView> presenter) {
        return presenter;
    }




    @Provides
    @PerActivity
    DetailProductMvpPresenter<DetailProductMvpView> provideDetailProductPresenter(
            DetailProductPresenter<DetailProductMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    CategoryMvpPresenter<CategoryMvpView> provideCategoryPresenter(
            CategoryPresenter<CategoryMvpView> presenter) {
        return presenter;
    }




    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
