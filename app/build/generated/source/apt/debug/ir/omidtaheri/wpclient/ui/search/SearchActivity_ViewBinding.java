// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.search;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchActivity_ViewBinding implements Unbinder {
  private SearchActivity target;

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target, View source) {
    this.target = target;

    target.post_List = Utils.findRequiredViewAsType(source, R.id.post_list, "field 'post_List'", RecyclerView.class);
    target.mainProgress = Utils.findRequiredViewAsType(source, R.id.main_progress, "field 'mainProgress'", ProgressBar.class);
    target.erroreText = Utils.findRequiredViewAsType(source, R.id.errore_text, "field 'erroreText'", TextView.class);
    target.errorBtnRetry = Utils.findRequiredViewAsType(source, R.id.error_btn_retry, "field 'errorBtnRetry'", Button.class);
    target.errorLayout = Utils.findRequiredViewAsType(source, R.id.error_layout, "field 'errorLayout'", ConstraintLayout.class);
    target.searchView = Utils.findRequiredViewAsType(source, R.id.searchView, "field 'searchView'", SearchView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.post_List = null;
    target.mainProgress = null;
    target.erroreText = null;
    target.errorBtnRetry = null;
    target.errorLayout = null;
    target.searchView = null;
  }
}
