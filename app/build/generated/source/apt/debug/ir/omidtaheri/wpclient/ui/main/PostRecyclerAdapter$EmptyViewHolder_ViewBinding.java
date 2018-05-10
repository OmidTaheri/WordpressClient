// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PostRecyclerAdapter$EmptyViewHolder_ViewBinding implements Unbinder {
  private PostRecyclerAdapter.EmptyViewHolder target;

  @UiThread
  public PostRecyclerAdapter$EmptyViewHolder_ViewBinding(PostRecyclerAdapter.EmptyViewHolder target, View source) {
    this.target = target;

    target.message = Utils.findRequiredViewAsType(source, R.id.message, "field 'message'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PostRecyclerAdapter.EmptyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.message = null;
  }
}
