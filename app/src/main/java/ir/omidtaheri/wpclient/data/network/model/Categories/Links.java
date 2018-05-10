
package ir.omidtaheri.wpclient.data.network.model.Categories;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links implements Parcelable
{

    @SerializedName("self")
    @Expose
    private List<Self> self = null;
    @SerializedName("collection")
    @Expose
    private List<Collection> collection = null;
    @SerializedName("about")
    @Expose
    private List<About> about = null;
    @SerializedName("up")
    @Expose
    private List<Up> up = null;
    @SerializedName("wp:post_type")
    @Expose
    private List<WpPostType> wpPostType = null;
    @SerializedName("curies")
    @Expose
    private List<Cury> curies = null;
    public final static Creator<Links> CREATOR = new Creator<Links>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links createFromParcel(Parcel in) {
            return new Links(in);
        }

        public Links[] newArray(int size) {
            return (new Links[size]);
        }

    }
    ;

    protected Links(Parcel in) {
        in.readList(this.self, (ir.omidtaheri.wpclient.data.network.model.Categories.Self.class.getClassLoader()));
        in.readList(this.collection, (ir.omidtaheri.wpclient.data.network.model.Categories.Collection.class.getClassLoader()));
        in.readList(this.about, (ir.omidtaheri.wpclient.data.network.model.Categories.About.class.getClassLoader()));
        in.readList(this.up, (ir.omidtaheri.wpclient.data.network.model.Categories.Up.class.getClassLoader()));
        in.readList(this.wpPostType, (ir.omidtaheri.wpclient.data.network.model.Categories.WpPostType.class.getClassLoader()));
        in.readList(this.curies, (ir.omidtaheri.wpclient.data.network.model.Categories.Cury.class.getClassLoader()));
    }

    public Links() {
    }

    public List<Self> getSelf() {
        return self;
    }

    public void setSelf(List<Self> self) {
        this.self = self;
    }

    public Links withSelf(List<Self> self) {
        this.self = self;
        return this;
    }

    public List<Collection> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    public Links withCollection(List<Collection> collection) {
        this.collection = collection;
        return this;
    }

    public List<About> getAbout() {
        return about;
    }

    public void setAbout(List<About> about) {
        this.about = about;
    }

    public Links withAbout(List<About> about) {
        this.about = about;
        return this;
    }

    public List<Up> getUp() {
        return up;
    }

    public void setUp(List<Up> up) {
        this.up = up;
    }

    public Links withUp(List<Up> up) {
        this.up = up;
        return this;
    }

    public List<WpPostType> getWpPostType() {
        return wpPostType;
    }

    public void setWpPostType(List<WpPostType> wpPostType) {
        this.wpPostType = wpPostType;
    }

    public Links withWpPostType(List<WpPostType> wpPostType) {
        this.wpPostType = wpPostType;
        return this;
    }

    public List<Cury> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    public Links withCuries(List<Cury> curies) {
        this.curies = curies;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(self);
        dest.writeList(collection);
        dest.writeList(about);
        dest.writeList(up);
        dest.writeList(wpPostType);
        dest.writeList(curies);
    }

    public int describeContents() {
        return  0;
    }

}
