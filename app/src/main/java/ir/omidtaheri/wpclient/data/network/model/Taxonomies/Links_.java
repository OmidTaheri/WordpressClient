
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links_ implements Parcelable
{

    @SerializedName("collection")
    @Expose
    private List<Collection_> collection = null;
    @SerializedName("wp:items")
    @Expose
    private List<WpItem_> wpItems = null;
    @SerializedName("curies")
    @Expose
    private List<Cury_> curies = null;
    public final static Creator<Links_> CREATOR = new Creator<Links_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links_ createFromParcel(Parcel in) {
            return new Links_(in);
        }

        public Links_[] newArray(int size) {
            return (new Links_[size]);
        }

    }
    ;

    protected Links_(Parcel in) {
        in.readList(this.collection, (Collection_.class.getClassLoader()));
        in.readList(this.wpItems, (ir.omidtaheri.wpclient.data.network.model.Taxonomies.WpItem_.class.getClassLoader()));
        in.readList(this.curies, (Cury_.class.getClassLoader()));
    }

    public Links_() {
    }

    public List<Collection_> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection_> collection) {
        this.collection = collection;
    }

    public Links_ withCollection(List<Collection_> collection) {
        this.collection = collection;
        return this;
    }

    public List<WpItem_> getWpItems() {
        return wpItems;
    }

    public void setWpItems(List<WpItem_> wpItems) {
        this.wpItems = wpItems;
    }

    public Links_ withWpItems(List<WpItem_> wpItems) {
        this.wpItems = wpItems;
        return this;
    }

    public List<Cury_> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury_> curies) {
        this.curies = curies;
    }

    public Links_ withCuries(List<Cury_> curies) {
        this.curies = curies;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(collection);
        dest.writeList(wpItems);
        dest.writeList(curies);
    }

    public int describeContents() {
        return  0;
    }

}
