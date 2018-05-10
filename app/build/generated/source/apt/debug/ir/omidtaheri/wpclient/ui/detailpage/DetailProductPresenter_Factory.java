package ir.omidtaheri.wpclient.ui.detailpage;

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
public final class DetailProductPresenter_Factory<V extends DetailProductMvpView>
    implements Factory<DetailProductPresenter<V>> {
  private final MembersInjector<DetailProductPresenter<V>> detailProductPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public DetailProductPresenter_Factory(
      MembersInjector<DetailProductPresenter<V>> detailProductPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert detailProductPresenterMembersInjector != null;
    this.detailProductPresenterMembersInjector = detailProductPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public DetailProductPresenter<V> get() {
    return MembersInjectors.injectMembers(
        detailProductPresenterMembersInjector,
        new DetailProductPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends DetailProductMvpView> Factory<DetailProductPresenter<V>> create(
      MembersInjector<DetailProductPresenter<V>> detailProductPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new DetailProductPresenter_Factory<V>(
        detailProductPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
