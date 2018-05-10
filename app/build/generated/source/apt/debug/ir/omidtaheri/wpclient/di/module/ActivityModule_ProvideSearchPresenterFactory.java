package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.ui.search.SearchMvpPresenter;
import ir.omidtaheri.wpclient.ui.search.SearchMvpView;
import ir.omidtaheri.wpclient.ui.search.SearchPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSearchPresenterFactory
    implements Factory<SearchMvpPresenter<SearchMvpView>> {
  private final ActivityModule module;

  private final Provider<SearchPresenter<SearchMvpView>> presenterProvider;

  public ActivityModule_ProvideSearchPresenterFactory(
      ActivityModule module, Provider<SearchPresenter<SearchMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public SearchMvpPresenter<SearchMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideSearchPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SearchMvpPresenter<SearchMvpView>> create(
      ActivityModule module, Provider<SearchPresenter<SearchMvpView>> presenterProvider) {
    return new ActivityModule_ProvideSearchPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideSearchPresenter(SearchPresenter)}. */
  public static SearchMvpPresenter<SearchMvpView> proxyProvideSearchPresenter(
      ActivityModule instance, SearchPresenter<SearchMvpView> presenter) {
    return instance.provideSearchPresenter(presenter);
  }
}
