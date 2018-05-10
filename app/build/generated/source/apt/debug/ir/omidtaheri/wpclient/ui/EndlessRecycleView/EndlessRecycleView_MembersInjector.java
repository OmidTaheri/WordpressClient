package ir.omidtaheri.wpclient.ui.EndlessRecycleView;

import dagger.MembersInjector;
import io.reactivex.disposables.CompositeDisposable;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EndlessRecycleView_MembersInjector
    implements MembersInjector<EndlessRecycleView> {
  private final Provider<DataManager> mDataManagerProvider;

  private final Provider<SchedulerProvider> mSchedulerProvider;

  private final Provider<CompositeDisposable> mCompositeDisposableProvider;

  public EndlessRecycleView_MembersInjector(
      Provider<DataManager> mDataManagerProvider,
      Provider<SchedulerProvider> mSchedulerProvider,
      Provider<CompositeDisposable> mCompositeDisposableProvider) {
    assert mDataManagerProvider != null;
    this.mDataManagerProvider = mDataManagerProvider;
    assert mSchedulerProvider != null;
    this.mSchedulerProvider = mSchedulerProvider;
    assert mCompositeDisposableProvider != null;
    this.mCompositeDisposableProvider = mCompositeDisposableProvider;
  }

  public static MembersInjector<EndlessRecycleView> create(
      Provider<DataManager> mDataManagerProvider,
      Provider<SchedulerProvider> mSchedulerProvider,
      Provider<CompositeDisposable> mCompositeDisposableProvider) {
    return new EndlessRecycleView_MembersInjector(
        mDataManagerProvider, mSchedulerProvider, mCompositeDisposableProvider);
  }

  @Override
  public void injectMembers(EndlessRecycleView instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataManager = mDataManagerProvider.get();
    instance.mSchedulerProvider = mSchedulerProvider.get();
    instance.mCompositeDisposable = mCompositeDisposableProvider.get();
  }

  public static void injectMDataManager(
      EndlessRecycleView instance, Provider<DataManager> mDataManagerProvider) {
    instance.mDataManager = mDataManagerProvider.get();
  }

  public static void injectMSchedulerProvider(
      EndlessRecycleView instance, Provider<SchedulerProvider> mSchedulerProvider) {
    instance.mSchedulerProvider = mSchedulerProvider.get();
  }

  public static void injectMCompositeDisposable(
      EndlessRecycleView instance, Provider<CompositeDisposable> mCompositeDisposableProvider) {
    instance.mCompositeDisposable = mCompositeDisposableProvider.get();
  }
}
