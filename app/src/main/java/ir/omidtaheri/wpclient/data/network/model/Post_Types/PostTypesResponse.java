
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostTypesResponse implements Parcelable
{

    @SerializedName("post")
    @Expose
    private Post post;
    @SerializedName("page")
    @Expose
    private Page page;
    @SerializedName("attachment")
    @Expose
    private Attachment attachment;
    @SerializedName("product")
    @Expose
    private Product product;
    public final static Creator<PostTypesResponse> CREATOR = new Creator<PostTypesResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PostTypesResponse createFromParcel(Parcel in) {
            return new PostTypesResponse(in);
        }

        public PostTypesResponse[] newArray(int size) {
            return (new PostTypesResponse[size]);
        }

    }
    ;

    protected PostTypesResponse(Parcel in) {
        this.post = ((Post) in.readValue((Post.class.getClassLoader())));
        this.page = ((Page) in.readValue((Page.class.getClassLoader())));
        this.attachment = ((Attachment) in.readValue((Attachment.class.getClassLoader())));
        this.product = ((Product) in.readValue((Product.class.getClassLoader())));
    }

    public PostTypesResponse() {
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public PostTypesResponse withPost(Post post) {
        this.post = post;
        return this;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public PostTypesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public PostTypesResponse withAttachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public PostTypesResponse withProduct(Product product) {
        this.product = product;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(post);
        dest.writeValue(page);
        dest.writeValue(attachment);
        dest.writeValue(product);
    }

    public int describeContents() {
        return  0;
    }

}
