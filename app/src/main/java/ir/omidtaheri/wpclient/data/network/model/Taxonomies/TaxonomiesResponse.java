
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaxonomiesResponse implements Parcelable
{

    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("post_tag")
    @Expose
    private PostTag postTag;
    public final static Creator<TaxonomiesResponse> CREATOR = new Creator<TaxonomiesResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public TaxonomiesResponse createFromParcel(Parcel in) {
            return new TaxonomiesResponse(in);
        }

        public TaxonomiesResponse[] newArray(int size) {
            return (new TaxonomiesResponse[size]);
        }

    }
    ;

    protected TaxonomiesResponse(Parcel in) {
        this.category = ((Category) in.readValue((Category.class.getClassLoader())));
        this.postTag = ((PostTag) in.readValue((PostTag.class.getClassLoader())));
    }

    public TaxonomiesResponse() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TaxonomiesResponse withCategory(Category category) {
        this.category = category;
        return this;
    }

    public PostTag getPostTag() {
        return postTag;
    }

    public void setPostTag(PostTag postTag) {
        this.postTag = postTag;
    }

    public TaxonomiesResponse withPostTag(PostTag postTag) {
        this.postTag = postTag;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(category);
        dest.writeValue(postTag);
    }

    public int describeContents() {
        return  0;
    }

}
