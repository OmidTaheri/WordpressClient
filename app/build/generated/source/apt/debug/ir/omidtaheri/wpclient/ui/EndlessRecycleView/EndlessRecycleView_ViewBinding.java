// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.EndlessRecycleView;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EndlessRecycleView_ViewBinding implements Unbinder {
  private EndlessRecycleView target;

  @UiThread
  public EndlessRecycleView_ViewBinding(EndlessRecycleView target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EndlessRecycleView_ViewBinding(EndlessRecycleView target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mainRecycler = Utils.findRequiredViewAsType(source, R.id.main_recycler, "field 'mainRecycler'", RecyclerView.class);
    target.mainProgress = Utils.findRequiredViewAsType(source, R.id.main_progress, "field 'mainProgress'", ProgressBar.class);
    target.errorBtnRetry = Utils.findRequiredViewAsType(source, R.id.error_btn_retry, "field 'errorBtnRetry'", Button.class);
    target.errorLayout = Utils.findRequiredViewAsType(source, R.id.error_layout, "field 'errorLayout'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EndlessRecycleView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.mainRecycler = null;
    target.mainProgress = null;
    target.errorBtnRetry = null;
    target.errorLayout = null;
  }
}
