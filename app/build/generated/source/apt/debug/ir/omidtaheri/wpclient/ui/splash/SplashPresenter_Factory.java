package ir.omidtaheri.wpclient.ui.splash;

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
public final class SplashPresenter_Factory<V extends SplashMvpView>
    implements Factory<SplashPresenter<V>> {
  private final MembersInjector<SplashPresenter<V>> splashPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public SplashPresenter_Factory(
      MembersInjector<SplashPresenter<V>> splashPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert splashPresenterMembersInjector != null;
    this.splashPresenterMembersInjector = splashPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public SplashPresenter<V> get() {
    return MembersInjectors.injectMembers(
        splashPresenterMembersInjector,
        new SplashPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends SplashMvpView> Factory<SplashPresenter<V>> create(
      MembersInjector<SplashPresenter<V>> splashPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new SplashPresenter_Factory<V>(
        splashPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
