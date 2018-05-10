package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.data.AppDataManager;
import ir.omidtaheri.wpclient.data.DataManager;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDataManagerFactory implements Factory<DataManager> {
  private final ApplicationModule module;

  private final Provider<AppDataManager> appDataManagerProvider;

  public ApplicationModule_ProvideDataManagerFactory(
      ApplicationModule module, Provider<AppDataManager> appDataManagerProvider) {
    assert module != null;
    this.module = module;
    assert appDataManagerProvider != null;
    this.appDataManagerProvider = appDataManagerProvider;
  }

  @Override
  public DataManager get() {
    return Preconditions.checkNotNull(
        module.provideDataManager(appDataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DataManager> create(
      ApplicationModule module, Provider<AppDataManager> appDataManagerProvider) {
    return new ApplicationModule_ProvideDataManagerFactory(module, appDataManagerProvider);
  }

  /** Proxies {@link ApplicationModule#provideDataManager(AppDataManager)}. */
  public static DataManager proxyProvideDataManager(
      ApplicationModule instance, AppDataManager appDataManager) {
    return instance.provideDataManager(appDataManager);
  }
}
