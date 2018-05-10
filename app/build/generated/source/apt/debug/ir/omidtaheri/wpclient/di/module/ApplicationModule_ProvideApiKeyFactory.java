package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideApiKeyFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApiKeyFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideApiKey(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(ApplicationModule module) {
    return new ApplicationModule_ProvideApiKeyFactory(module);
  }

  /** Proxies {@link ApplicationModule#provideApiKey()}. */
  public static String proxyProvideApiKey(ApplicationModule instance) {
    return instance.provideApiKey();
  }
}
