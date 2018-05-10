
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links implements Parcelable
{

    @SerializedName("collection")
    @Expose
    private List<Collection> collection = null;
    @SerializedName("wp:items")
    @Expose
    private List<WpItem> wpItems = null;
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
        in.readList(this.collection, (Collection.class.getClassLoader()));
        in.readList(this.wpItems, (ir.omidtaheri.wpclient.data.network.model.Taxonomies.WpItem.class.getClassLoader()));
        in.readList(this.curies, (Cury.class.getClassLoader()));
    }

    public Links() {
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

    public List<WpItem> getWpItems() {
        return wpItems;
    }

    public void setWpItems(List<WpItem> wpItems) {
        this.wpItems = wpItems;
    }

    public Links withWpItems(List<WpItem> wpItems) {
        this.wpItems = wpItems;
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
        dest.writeList(collection);
        dest.writeList(wpItems);
        dest.writeList(curies);
    }

    public int describeContents() {
        return  0;
    }

}
