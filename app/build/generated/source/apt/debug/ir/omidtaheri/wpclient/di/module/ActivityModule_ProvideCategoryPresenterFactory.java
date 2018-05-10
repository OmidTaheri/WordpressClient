package ir.omidtaheri.wpclient.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.omidtaheri.wpclient.ui.category.CategoryMvpPresenter;
import ir.omidtaheri.wpclient.ui.category.CategoryMvpView;
import ir.omidtaheri.wpclient.ui.category.CategoryPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideCategoryPresenterFactory
    implements Factory<CategoryMvpPresenter<CategoryMvpView>> {
  private final ActivityModule module;

  private final Provider<CategoryPresenter<CategoryMvpView>> presenterProvider;

  public ActivityModule_ProvideCategoryPresenterFactory(
      ActivityModule module, Provider<CategoryPresenter<CategoryMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public CategoryMvpPresenter<CategoryMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideCategoryPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CategoryMvpPresenter<CategoryMvpView>> create(
      ActivityModule module, Provider<CategoryPresenter<CategoryMvpView>> presenterProvider) {
    return new ActivityModule_ProvideCategoryPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideCategoryPresenter(CategoryPresenter)}. */
  public static CategoryMvpPresenter<CategoryMvpView> proxyProvideCategoryPresenter(
      ActivityModule instance, CategoryPresenter<CategoryMvpView> presenter) {
    return instance.provideCategoryPresenter(presenter);
  }
}
