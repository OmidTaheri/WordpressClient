package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductMvpPresenter;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductMvpView;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideDetailProductPresenterFactory
    implements Factory<DetailProductMvpPresenter<DetailProductMvpView>> {
  private final ActivityModule module;

  private final Provider<DetailProductPresenter<DetailProductMvpView>> presenterProvider;

  public ActivityModule_ProvideDetailProductPresenterFactory(
      ActivityModule module,
      Provider<DetailProductPresenter<DetailProductMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public DetailProductMvpPresenter<DetailProductMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideDetailProductPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DetailProductMvpPresenter<DetailProductMvpView>> create(
      ActivityModule module,
      Provider<DetailProductPresenter<DetailProductMvpView>> presenterProvider) {
    return new ActivityModule_ProvideDetailProductPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideDetailProductPresenter(DetailProductPresenter)}. */
  public static DetailProductMvpPresenter<DetailProductMvpView> proxyProvideDetailProductPresenter(
      ActivityModule instance, DetailProductPresenter<DetailProductMvpView> presenter) {
    return instance.provideDetailProductPresenter(presenter);
  }
}
