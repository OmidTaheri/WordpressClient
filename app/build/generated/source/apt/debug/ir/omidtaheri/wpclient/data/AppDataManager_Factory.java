package ir.omidtaheri.wpclient.data;

import android.content.Context;
import dagger.internal.Factory;
import ir.omidtaheri.wpclient.data.network.ApiHelper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppDataManager_Factory implements Factory<AppDataManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public AppDataManager_Factory(
      Provider<Context> contextProvider, Provider<ApiHelper> apiHelperProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public AppDataManager get() {
    return new AppDataManager(contextProvider.get(), apiHelperProvider.get());
  }

  public static Factory<AppDataManager> create(
      Provider<Context> contextProvider, Provider<ApiHelper> apiHelperProvider) {
    return new AppDataManager_Factory(contextProvider, apiHelperProvider);
  }
}
