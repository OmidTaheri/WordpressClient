// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.category;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CategoryRecyclerAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CategoryRecyclerAdapter.ViewHolder target;

  @UiThread
  public CategoryRecyclerAdapter$ViewHolder_ViewBinding(CategoryRecyclerAdapter.ViewHolder target, View source) {
    this.target = target;

    target.categoryName = Utils.findRequiredViewAsType(source, R.id.category_name, "field 'categoryName'", TextView.class);
    target.categoryImage = Utils.findRequiredViewAsType(source, R.id.category_image, "field 'categoryImage'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CategoryRecyclerAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.categoryName = null;
    target.categoryImage = null;
  }
}
