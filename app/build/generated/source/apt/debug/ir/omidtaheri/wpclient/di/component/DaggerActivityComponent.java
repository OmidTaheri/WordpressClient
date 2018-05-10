package ir.omidtaheri.wpclient.di.component;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.di.module.ActivityModule;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideCategoryPresenterFactory;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideDetailProductPresenterFactory;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideMainPresenterFactory;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideSearchPresenterFactory;
import ir.omidtaheri.wpclient.di.module.ActivityModule_ProvideSplashPresenterFactory;
import ir.omidtaheri.wpclient.ui.category.CategoryActivity;
import ir.omidtaheri.wpclient.ui.category.CategoryActivity_MembersInjector;
import ir.omidtaheri.wpclient.ui.category.CategoryMvpPresenter;
import ir.omidtaheri.wpclient.ui.category.CategoryMvpView;
import ir.omidtaheri.wpclient.ui.category.CategoryPresenter;
import ir.omidtaheri.wpclient.ui.category.CategoryPresenter_Factory;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductActivity;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductActivity_MembersInjector;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductMvpPresenter;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductMvpView;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductPresenter;
import ir.omidtaheri.wpclient.ui.detailpage.DetailProductPresenter_Factory;
import ir.omidtaheri.wpclient.ui.main.MainActivity;
import ir.omidtaheri.wpclient.ui.main.MainActivity_MembersInjector;
import ir.omidtaheri.wpclient.ui.main.MainMvpPresenter;
import ir.omidtaheri.wpclient.ui.main.MainMvpView;
import ir.omidtaheri.wpclient.ui.main.MainPresenter;
import ir.omidtaheri.wpclient.ui.main.MainPresenter_Factory;
import ir.omidtaheri.wpclient.ui.search.SearchActivity;
import ir.omidtaheri.wpclient.ui.search.SearchActivity_MembersInjector;
import ir.omidtaheri.wpclient.ui.search.SearchMvpPresenter;
import ir.omidtaheri.wpclient.ui.search.SearchMvpView;
import ir.omidtaheri.wpclient.ui.search.SearchPresenter;
import ir.omidtaheri.wpclient.ui.search.SearchPresenter_Factory;
import ir.omidtaheri.wpclient.ui.splash.SplashActivity;
import ir.omidtaheri.wpclient.ui.splash.SplashActivity_MembersInjector;
import ir.omidtaheri.wpclient.ui.splash.SplashMvpPresenter;
import ir.omidtaheri.wpclient.ui.splash.SplashMvpView;
import ir.omidtaheri.wpclient.ui.splash.SplashPresenter;
import ir.omidtaheri.wpclient.ui.splash.SplashPresenter_Factory;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> getDataManagerProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<SplashPresenter<SplashMvpView>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView>> provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<MainPresenter<MainMvpView>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<CategoryPresenter<CategoryMvpView>> categoryPresenterProvider;

  private Provider<CategoryMvpPresenter<CategoryMvpView>> provideCategoryPresenterProvider;

  private MembersInjector<CategoryActivity> categoryActivityMembersInjector;

  private Provider<DetailProductPresenter<DetailProductMvpView>> detailProductPresenterProvider;

  private Provider<DetailProductMvpPresenter<DetailProductMvpView>>
      provideDetailProductPresenterProvider;

  private MembersInjector<DetailProductActivity> detailProductActivityMembersInjector;

  private Provider<SearchPresenter<SearchMvpView>> searchPresenterProvider;

  private Provider<SearchMvpPresenter<SearchMvpView>> provideSearchPresenterProvider;

  private MembersInjector<SearchActivity> searchActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.categoryPresenterProvider =
        CategoryPresenter_Factory.create(
            MembersInjectors.<CategoryPresenter<CategoryMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideCategoryPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideCategoryPresenterFactory.create(
                builder.activityModule, categoryPresenterProvider));

    this.categoryActivityMembersInjector =
        CategoryActivity_MembersInjector.create(provideCategoryPresenterProvider);

    this.detailProductPresenterProvider =
        DetailProductPresenter_Factory.create(
            MembersInjectors.<DetailProductPresenter<DetailProductMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideDetailProductPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideDetailProductPresenterFactory.create(
                builder.activityModule, detailProductPresenterProvider));

    this.detailProductActivityMembersInjector =
        DetailProductActivity_MembersInjector.create(provideDetailProductPresenterProvider);

    this.searchPresenterProvider =
        SearchPresenter_Factory.create(
            MembersInjectors.<SearchPresenter<SearchMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSearchPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSearchPresenterFactory.create(
                builder.activityModule, searchPresenterProvider));

    this.searchActivityMembersInjector =
        SearchActivity_MembersInjector.create(provideSearchPresenterProvider);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(CategoryActivity activity) {
    categoryActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(DetailProductActivity activity) {
    detailProductActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SearchActivity activity) {
    searchActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
