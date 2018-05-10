package ir.omidtaheri.wpclient.ui.detailpage;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailProductActivity_MembersInjector
    implements MembersInjector<DetailProductActivity> {
  private final Provider<DetailProductMvpPresenter<DetailProductMvpView>> mPresenterProvider;

  public DetailProductActivity_MembersInjector(
      Provider<DetailProductMvpPresenter<DetailProductMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<DetailProductActivity> create(
      Provider<DetailProductMvpPresenter<DetailProductMvpView>> mPresenterProvider) {
    return new DetailProductActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(DetailProductActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      DetailProductActivity instance,
      Provider<DetailProductMvpPresenter<DetailProductMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
