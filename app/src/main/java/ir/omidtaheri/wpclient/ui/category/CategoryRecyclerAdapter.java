package ir.omidtaheri.wpclient.ui.category;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.network.model.Categories.CategoriesResponse;
import ir.omidtaheri.wpclient.ui.base.BaseViewHolder;


public class CategoryRecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    private List<CategoriesResponse> list;
    private Context mContext;
    private Callback mCallback;

    public CategoryRecyclerAdapter(List<CategoriesResponse> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    public void setCallback(Callback callback) {
        mCallback = callback;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_category, parent, false));

    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public void addItems(List<CategoriesResponse> repoList) {
        list.addAll(repoList);
        notifyDataSetChanged();
    }

    public interface Callback {
        void onItemClick(int id);
    }


    public class ViewHolder extends BaseViewHolder {


        @BindView(R.id.category_name)
        TextView categoryName;
        @BindView(R.id.category_image)
        ConstraintLayout categoryImage;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {

        }

        @Override
        public void onBind(int position) {
            super.onBind(position);

            final CategoriesResponse item = list.get(position);


            if (position == 0) {
                categoryImage.setBackgroundResource(R.drawable.poost);
            } else if (position == 1) {
                categoryImage.setBackgroundResource(R.drawable.pezeshki);
            }else if (position == 2) {
                categoryImage.setBackgroundResource(R.drawable.chaghi);
            }else if (position == 3) {
                categoryImage.setBackgroundResource(R.drawable.giahan);
            }else if (position == 4) {
                categoryImage.setBackgroundResource(R.drawable.giahan);
            }else if (position == 5) {
                categoryImage.setBackgroundResource(R.drawable.laghari);
            }else if (position == 6) {
                categoryImage.setBackgroundResource(R.drawable.salamati);
            }else if (position == 7) {
                categoryImage.setBackgroundResource(R.drawable.nooshidani);
            }
            categoryName.setText(item.getName());





            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCallback != null)
                        mCallback.onItemClick(item.getId());


                }
            });
        }
    }
}
