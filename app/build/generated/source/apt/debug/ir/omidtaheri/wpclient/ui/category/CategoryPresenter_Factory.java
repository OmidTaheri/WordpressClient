package ir.omidtaheri.wpclient.ui.category;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CategoryPresenter_Factory<V extends CategoryMvpView>
    implements Factory<CategoryPresenter<V>> {
  private final MembersInjector<CategoryPresenter<V>> categoryPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public CategoryPresenter_Factory(
      MembersInjector<CategoryPresenter<V>> categoryPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert categoryPresenterMembersInjector != null;
    this.categoryPresenterMembersInjector = categoryPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public CategoryPresenter<V> get() {
    return MembersInjectors.injectMembers(
        categoryPresenterMembersInjector,
        new CategoryPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends CategoryMvpView> Factory<CategoryPresenter<V>> create(
      MembersInjector<CategoryPresenter<V>> categoryPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new CategoryPresenter_Factory<V>(
        categoryPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
