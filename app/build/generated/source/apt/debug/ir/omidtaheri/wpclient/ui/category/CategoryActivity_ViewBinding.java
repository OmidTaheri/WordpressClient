// Generated code from Butter Knife. Do not modify!
package ir.omidtaheri.wpclient.ui.category;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import ir.omidtaheri.wpclient.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CategoryActivity_ViewBinding implements Unbinder {
  private CategoryActivity target;

  @UiThread
  public CategoryActivity_ViewBinding(CategoryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CategoryActivity_ViewBinding(CategoryActivity target, View source) {
    this.target = target;

    target.category_list = Utils.findRequiredViewAsType(source, R.id.category_list, "field 'category_list'", RecyclerView.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CategoryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.category_list = null;
    target.mToolbar = null;
  }
}
