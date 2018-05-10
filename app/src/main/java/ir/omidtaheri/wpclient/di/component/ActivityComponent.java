

package ir.omidtaheri.wpclient.di.component;

import ir.omidtaheri.wpclient.di.PerActivity;
import ir.omidtaheri.wpclient.di.module.ActivityModule;

import ir.omidtaheri.wpclient.ui.category.CategoryActivity;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductActivity;
import ir.omidtaheri.wpclient.ui.main.MainActivity;
import ir.omidtaheri.wpclient.ui.search.SearchActivity;
import ir.omidtaheri.wpclient.ui.splash.SplashActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);
    void inject(MainActivity activity);

    void inject(CategoryActivity activity);
    void inject(DetailProductActivity activity);

    void inject(SearchActivity activity);





}
