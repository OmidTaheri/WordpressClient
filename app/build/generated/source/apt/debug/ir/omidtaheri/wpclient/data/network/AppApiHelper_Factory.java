package ir.omidtaheri.wpclient.data.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppApiHelper_Factory implements Factory<AppApiHelper> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  public AppApiHelper_Factory(Provider<ApiInterface> apiInterfaceProvider) {
    assert apiInterfaceProvider != null;
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public AppApiHelper get() {
    return new AppApiHelper(apiInterfaceProvider.get());
  }

  public static Factory<AppApiHelper> create(Provider<ApiInterface> apiInterfaceProvider) {
    return new AppApiHelper_Factory(apiInterfaceProvider);
  }
}
