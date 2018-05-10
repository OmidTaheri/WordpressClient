// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PostRecyclerAdapter$ViewHolder_ViewBinding implements Unbinder {
  private PostRecyclerAdapter.ViewHolder target;

  @UiThread
  public PostRecyclerAdapter$ViewHolder_ViewBinding(PostRecyclerAdapter.ViewHolder target, View source) {
    this.target = target;

    target.authorImage = Utils.findRequiredViewAsType(source, R.id.author_image, "field 'authorImage'", ImageView.class);
    target.postImage = Utils.findRequiredViewAsType(source, R.id.post_image, "field 'postImage'", ImageView.class);
    target.postTitle = Utils.findRequiredViewAsType(source, R.id.post_title, "field 'postTitle'", TextView.class);
    target.postText = Utils.findRequiredViewAsType(source, R.id.post_text, "field 'postText'", TextView.class);
    target.Read_more = Utils.findRequiredViewAsType(source, R.id.Read_more, "field 'Read_more'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PostRecyclerAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.authorImage = null;
    target.postImage = null;
    target.postTitle = null;
    target.postText = null;
    target.Read_more = null;
    target.date = null;
  }
}
