// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.post_list = Utils.findRequiredViewAsType(source, R.id.post_list, "field 'post_list'", RecyclerView.class);
    target.mainProgress = Utils.findRequiredViewAsType(source, R.id.main_progress, "field 'mainProgress'", ProgressBar.class);
    target.erroreText = Utils.findRequiredViewAsType(source, R.id.errore_text, "field 'erroreText'", TextView.class);
    target.errorBtnRetry = Utils.findRequiredViewAsType(source, R.id.error_btn_retry, "field 'errorBtnRetry'", Button.class);
    target.errorLayout = Utils.findRequiredViewAsType(source, R.id.error_layout, "field 'errorLayout'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.post_list = null;
    target.mainProgress = null;
    target.erroreText = null;
    target.errorBtnRetry = null;
    target.errorLayout = null;
  }
}
