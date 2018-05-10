package ir.omidtaheri.wpclient;

import dagger.MembersInjector;
import ir.omidtaheri.wpclient.data.DataManager;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppLoader_MembersInjector implements MembersInjector<AppLoader> {
  private final Provider<DataManager> mDataManagerProvider;

  private final Provider<CalligraphyConfig> mCalligraphyConfigProvider;

  public AppLoader_MembersInjector(
      Provider<DataManager> mDataManagerProvider,
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    assert mDataManagerProvider != null;
    this.mDataManagerProvider = mDataManagerProvider;
    assert mCalligraphyConfigProvider != null;
    this.mCalligraphyConfigProvider = mCalligraphyConfigProvider;
  }

  public static MembersInjector<AppLoader> create(
      Provider<DataManager> mDataManagerProvider,
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    return new AppLoader_MembersInjector(mDataManagerProvider, mCalligraphyConfigProvider);
  }

  @Override
  public void injectMembers(AppLoader instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataManager = mDataManagerProvider.get();
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }

  public static void injectMDataManager(
      AppLoader instance, Provider<DataManager> mDataManagerProvider) {
    instance.mDataManager = mDataManagerProvider.get();
  }

  public static void injectMCalligraphyConfig(
      AppLoader instance, Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }
}
