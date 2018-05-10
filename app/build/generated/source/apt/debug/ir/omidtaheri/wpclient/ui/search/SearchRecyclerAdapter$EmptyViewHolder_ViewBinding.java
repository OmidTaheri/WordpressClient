// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.search;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchRecyclerAdapter$EmptyViewHolder_ViewBinding implements Unbinder {
  private SearchRecyclerAdapter.EmptyViewHolder target;

  @UiThread
  public SearchRecyclerAdapter$EmptyViewHolder_ViewBinding(SearchRecyclerAdapter.EmptyViewHolder target, View source) {
    this.target = target;

    target.message = Utils.findRequiredViewAsType(source, R.id.message, "field 'message'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchRecyclerAdapter.EmptyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.message = null;
  }
}
