package ir.omidtaheri.wpclient.ui.category;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CategoryActivity_MembersInjector implements MembersInjector<CategoryActivity> {
  private final Provider<CategoryMvpPresenter<CategoryMvpView>> mPresenterProvider;

  public CategoryActivity_MembersInjector(
      Provider<CategoryMvpPresenter<CategoryMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<CategoryActivity> create(
      Provider<CategoryMvpPresenter<CategoryMvpView>> mPresenterProvider) {
    return new CategoryActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(CategoryActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      CategoryActivity instance,
      Provider<CategoryMvpPresenter<CategoryMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
