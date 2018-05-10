package ir.omidtaheri.wpclient.ui.main;

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
public final class MainPresenter_Factory<V extends MainMvpView>
    implements Factory<MainPresenter<V>> {
  private final MembersInjector<MainPresenter<V>> mainPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MainPresenter_Factory(
      MembersInjector<MainPresenter<V>> mainPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert mainPresenterMembersInjector != null;
    this.mainPresenterMembersInjector = mainPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MainPresenter<V> get() {
    return MembersInjectors.injectMembers(
        mainPresenterMembersInjector,
        new MainPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MainMvpView> Factory<MainPresenter<V>> create(
      MembersInjector<MainPresenter<V>> mainPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MainPresenter_Factory<V>(
        mainPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
