package ir.omidtaheri.wpclient.di.module;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideLinearLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final ActivityModule module;

  private final Provider<AppCompatActivity> activityProvider;

  public ActivityModule_ProvideLinearLayoutManagerFactory(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    assert module != null;
    this.module = module;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return Preconditions.checkNotNull(
        module.provideLinearLayoutManager(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LinearLayoutManager> create(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    return new ActivityModule_ProvideLinearLayoutManagerFactory(module, activityProvider);
  }

  /** Proxies {@link ActivityModule#provideLinearLayoutManager(AppCompatActivity)}. */
  public static LinearLayoutManager proxyProvideLinearLayoutManager(
      ActivityModule instance, AppCompatActivity activity) {
    return instance.provideLinearLayoutManager(activity);
  }
}
