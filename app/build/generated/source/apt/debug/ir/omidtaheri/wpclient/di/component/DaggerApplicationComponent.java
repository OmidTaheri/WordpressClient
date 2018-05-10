package ir.omidtaheri.wpclient.di.component;

import android.app.Application;
import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.AppLoader;
import ir.omidtaheri.wpclient.AppLoader_MembersInjector;
import ir.omidtaheri.wpclient.data.AppDataManager;
import ir.omidtaheri.wpclient.data.AppDataManager_Factory;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.data.network.ApiHelper;
import ir.omidtaheri.wpclient.data.network.ApiInterface;
import ir.omidtaheri.wpclient.data.network.AppApiHelper;
import ir.omidtaheri.wpclient.data.network.AppApiHelper_Factory;
import ir.omidtaheri.wpclient.di.module.ApplicationModule;
import ir.omidtaheri.wpclient.di.module.ApplicationModule_ProvideApiHelperFactory;
import ir.omidtaheri.wpclient.di.module.ApplicationModule_ProvideApplicationFactory;
import ir.omidtaheri.wpclient.di.module.ApplicationModule_ProvideCalligraphyDefaultConfigFactory;
import ir.omidtaheri.wpclient.di.module.ApplicationModule_ProvideContextFactory;
import ir.omidtaheri.wpclient.di.module.ApplicationModule_ProvideDataManagerFactory;
import ir.omidtaheri.wpclient.di.module.NetworkModule;
import ir.omidtaheri.wpclient.di.module.NetworkModule_ProvideApiClientFactory;
import ir.omidtaheri.wpclient.di.module.NetworkModule_ProvideBaseUrlStringFactory;
import ir.omidtaheri.wpclient.di.module.NetworkModule_ProvideGsonConverterFactory;
import ir.omidtaheri.wpclient.di.module.NetworkModule_ProvideRetrofitFactory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Converter;
import retrofit2.Retrofit;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Converter.Factory> provideGsonConverterProvider;

  private Provider<String> provideBaseUrlStringProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ApiInterface> provideApiClientProvider;

  private Provider<AppApiHelper> appApiHelperProvider;

  private Provider<ApiHelper> provideApiHelperProvider;

  private Provider<AppDataManager> appDataManagerProvider;

  private Provider<DataManager> provideDataManagerProvider;

  private Provider<CalligraphyConfig> provideCalligraphyDefaultConfigProvider;

  private MembersInjector<AppLoader> appLoaderMembersInjector;

  private Provider<Application> provideApplicationProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);

    this.provideGsonConverterProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideGsonConverterFactory.create(builder.networkModule));

    this.provideBaseUrlStringProvider =
        NetworkModule_ProvideBaseUrlStringFactory.create(builder.networkModule);

    this.provideRetrofitProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetrofitFactory.create(
                builder.networkModule, provideGsonConverterProvider, provideBaseUrlStringProvider));

    this.provideApiClientProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideApiClientFactory.create(
                builder.networkModule, provideRetrofitProvider));

    this.appApiHelperProvider =
        DoubleCheck.provider(AppApiHelper_Factory.create(provideApiClientProvider));

    this.provideApiHelperProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideApiHelperFactory.create(
                builder.applicationModule, appApiHelperProvider));

    this.appDataManagerProvider =
        DoubleCheck.provider(
            AppDataManager_Factory.create(provideContextProvider, provideApiHelperProvider));

    this.provideDataManagerProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideDataManagerFactory.create(
                builder.applicationModule, appDataManagerProvider));

    this.provideCalligraphyDefaultConfigProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideCalligraphyDefaultConfigFactory.create(
                builder.applicationModule));

    this.appLoaderMembersInjector =
        AppLoader_MembersInjector.create(
            provideDataManagerProvider, provideCalligraphyDefaultConfigProvider);

    this.provideApplicationProvider =
        ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule);
  }

  @Override
  public void inject(AppLoader app) {
    appLoaderMembersInjector.injectMembers(app);
  }

  @Override
  public Context context() {
    return provideContextProvider.get();
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public DataManager getDataManager() {
    return provideDataManagerProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private NetworkModule networkModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
