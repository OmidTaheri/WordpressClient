package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideBaseUrlStringFactory implements Factory<String> {
  private final NetworkModule module;

  public NetworkModule_ProvideBaseUrlStringFactory(NetworkModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideBaseUrlString(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(NetworkModule module) {
    return new NetworkModule_ProvideBaseUrlStringFactory(module);
  }

  /** Proxies {@link NetworkModule#provideBaseUrlString()}. */
  public static String proxyProvideBaseUrlString(NetworkModule instance) {
    return instance.provideBaseUrlString();
  }
}
