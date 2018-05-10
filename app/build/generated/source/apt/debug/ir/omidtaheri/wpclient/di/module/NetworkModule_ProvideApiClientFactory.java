package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.data.network.ApiInterface;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideApiClientFactory implements Factory<ApiInterface> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideApiClientFactory(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiInterface get() {
    return Preconditions.checkNotNull(
        module.provideApiClient(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiInterface> create(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideApiClientFactory(module, retrofitProvider);
  }

  /** Proxies {@link NetworkModule#provideApiClient(Retrofit)}. */
  public static ApiInterface proxyProvideApiClient(NetworkModule instance, Retrofit retrofit) {
    return instance.provideApiClient(retrofit);
  }
}
