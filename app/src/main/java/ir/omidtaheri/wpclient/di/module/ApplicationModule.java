
package ir.omidtaheri.wpclient.di.module;

import android.app.Application;
import android.content.Context;

import ir.omidtaheri.wpclient.BuildConfig;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.AppDataManager;
import ir.omidtaheri.wpclient.data.DataManager;

import ir.omidtaheri.wpclient.data.network.ApiHelper;
import ir.omidtaheri.wpclient.data.network.AppApiHelper;

import ir.omidtaheri.wpclient.di.ApiInfo;
import ir.omidtaheri.wpclient.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;



@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }






    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }



    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/byekan.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}
