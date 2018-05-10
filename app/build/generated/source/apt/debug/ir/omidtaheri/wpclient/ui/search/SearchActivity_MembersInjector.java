package ir.omidtaheri.wpclient.ui.search;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<SearchMvpPresenter<SearchMvpView>> mPresenterProvider;

  public SearchActivity_MembersInjector(
      Provider<SearchMvpPresenter<SearchMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SearchActivity> create(
      Provider<SearchMvpPresenter<SearchMvpView>> mPresenterProvider) {
    return new SearchActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SearchActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      SearchActivity instance, Provider<SearchMvpPresenter<SearchMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
