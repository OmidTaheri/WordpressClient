// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PostRecyclerAdapter$LoadingViewHolder_ViewBinding implements Unbinder {
  private PostRecyclerAdapter.LoadingViewHolder target;

  @UiThread
  public PostRecyclerAdapter$LoadingViewHolder_ViewBinding(PostRecyclerAdapter.LoadingViewHolder target, View source) {
    this.target = target;

    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.loadmore_progress, "field 'mProgressBar'", ProgressBar.class);
    target.mRetryBtn = Utils.findRequiredViewAsType(source, R.id.loadmore_retry, "field 'mRetryBtn'", Button.class);
    target.mErrorTxt = Utils.findRequiredViewAsType(source, R.id.loadmore_errortxt, "field 'mErrorTxt'", TextView.class);
    target.mErrorLayout = Utils.findRequiredViewAsType(source, R.id.loadmore_errorlayout, "field 'mErrorLayout'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PostRecyclerAdapter.LoadingViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mProgressBar = null;
    target.mRetryBtn = null;
    target.mErrorTxt = null;
    target.mErrorLayout = null;
  }
}
