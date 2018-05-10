
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links___ implements Parcelable
{

    @SerializedName("collection")
    @Expose
    private List<Collection___> collection = null;
    @SerializedName("wp:items")
    @Expose
    private List<WpItem___> wpItems = null;
    @SerializedName("curies")
    @Expose
    private List<Cury___> curies = null;
    public final static Creator<Links___> CREATOR = new Creator<Links___>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links___ createFromParcel(Parcel in) {
            return new Links___(in);
        }

        public Links___[] newArray(int size) {
            return (new Links___[size]);
        }

    }
    ;

    protected Links___(Parcel in) {
        in.readList(this.collection, (Collection___.class.getClassLoader()));
        in.readList(this.wpItems, (ir.omidtaheri.wpclient.data.network.model.Post_Types.WpItem___.class.getClassLoader()));
        in.readList(this.curies, (Cury___.class.getClassLoader()));
    }

    public Links___() {
    }

    public List<Collection___> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection___> collection) {
        this.collection = collection;
    }

    public Links___ withCollection(List<Collection___> collection) {
        this.collection = collection;
        return this;
    }

    public List<WpItem___> getWpItems() {
        return wpItems;
    }

    public void setWpItems(List<WpItem___> wpItems) {
        this.wpItems = wpItems;
    }

    public Links___ withWpItems(List<WpItem___> wpItems) {
        this.wpItems = wpItems;
        return this;
    }

    public List<Cury___> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury___> curies) {
        this.curies = curies;
    }

    public Links___ withCuries(List<Cury___> curies) {
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
