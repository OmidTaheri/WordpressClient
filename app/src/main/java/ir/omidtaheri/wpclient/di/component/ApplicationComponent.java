
package ir.omidtaheri.wpclient.di.component;

import android.app.Application;
import android.content.Context;

import ir.omidtaheri.wpclient.AppLoader;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.di.ApplicationContext;
import ir.omidtaheri.wpclient.di.module.ApplicationModule;
import ir.omidtaheri.wpclient.di.module.NetworkModule;


import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(modules = {ApplicationModule.class,NetworkModule.class})
public interface ApplicationComponent {

    void inject(AppLoader app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}