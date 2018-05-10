package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.ui.splash.SplashMvpPresenter;
import ir.omidtaheri.wpclient.ui.splash.SplashMvpView;
import ir.omidtaheri.wpclient.ui.splash.SplashPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSplashPresenterFactory
    implements Factory<SplashMvpPresenter<SplashMvpView>> {
  private final ActivityModule module;

  private final Provider<SplashPresenter<SplashMvpView>> presenterProvider;

  public ActivityModule_ProvideSplashPresenterFactory(
      ActivityModule module, Provider<SplashPresenter<SplashMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public SplashMvpPresenter<SplashMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideSplashPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashMvpPresenter<SplashMvpView>> create(
      ActivityModule module, Provider<SplashPresenter<SplashMvpView>> presenterProvider) {
    return new ActivityModule_ProvideSplashPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideSplashPresenter(SplashPresenter)}. */
  public static SplashMvpPresenter<SplashMvpView> proxyProvideSplashPresenter(
      ActivityModule instance, SplashPresenter<SplashMvpView> presenter) {
    return instance.provideSplashPresenter(presenter);
  }
}
