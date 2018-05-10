// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.detailpage;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailProductActivity_ViewBinding implements Unbinder {
  private DetailProductActivity target;

  @UiThread
  public DetailProductActivity_ViewBinding(DetailProductActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailProductActivity_ViewBinding(DetailProductActivity target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.postImage = Utils.findRequiredViewAsType(source, R.id.post_image, "field 'postImage'", ImageView.class);
    target.postTitle = Utils.findRequiredViewAsType(source, R.id.post_title, "field 'postTitle'", TextView.class);
    target.postContext = Utils.findRequiredViewAsType(source, R.id.post_context, "field 'postContext'", TextView.class);
    target.tagsTitle = Utils.findRequiredViewAsType(source, R.id.tags_title, "field 'tagsTitle'", TextView.class);
    target.tagsContext = Utils.findRequiredViewAsType(source, R.id.tags_context, "field 'tagsContext'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailProductActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.postImage = null;
    target.postTitle = null;
    target.postContext = null;
    target.tagsTitle = null;
    target.tagsContext = null;
  }
}
