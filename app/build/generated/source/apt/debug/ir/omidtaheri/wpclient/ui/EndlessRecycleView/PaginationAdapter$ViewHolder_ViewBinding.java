// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.EndlessRecycleView;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PaginationAdapter$ViewHolder_ViewBinding implements Unbinder {
  private PaginationAdapter.ViewHolder target;

  @UiThread
  public PaginationAdapter$ViewHolder_ViewBinding(PaginationAdapter.ViewHolder target, View source) {
    this.target = target;

    target.itemText = Utils.findRequiredViewAsType(source, R.id.item_text, "field 'itemText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PaginationAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.itemText = null;
  }
}
