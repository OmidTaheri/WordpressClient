package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.ui.main.MainMvpPresenter;
import ir.omidtaheri.wpclient.ui.main.MainMvpView;
import ir.omidtaheri.wpclient.ui.main.MainPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMainPresenterFactory
    implements Factory<MainMvpPresenter<MainMvpView>> {
  private final ActivityModule module;

  private final Provider<MainPresenter<MainMvpView>> presenterProvider;

  public ActivityModule_ProvideMainPresenterFactory(
      ActivityModule module, Provider<MainPresenter<MainMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MainMvpPresenter<MainMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMainPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainMvpPresenter<MainMvpView>> create(
      ActivityModule module, Provider<MainPresenter<MainMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMainPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMainPresenter(MainPresenter)}. */
  public static MainMvpPresenter<MainMvpView> proxyProvideMainPresenter(
      ActivityModule instance, MainPresenter<MainMvpView> presenter) {
    return instance.provideMainPresenter(presenter);
  }
}
