
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links__ implements Parcelable
{

    @SerializedName("collection")
    @Expose
    private List<Collection__> collection = null;
    @SerializedName("wp:items")
    @Expose
    private List<WpItem__> wpItems = null;
    @SerializedName("curies")
    @Expose
    private List<Cury__> curies = null;
    public final static Creator<Links__> CREATOR = new Creator<Links__>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links__ createFromParcel(Parcel in) {
            return new Links__(in);
        }

        public Links__[] newArray(int size) {
            return (new Links__[size]);
        }

    }
    ;

    protected Links__(Parcel in) {
        in.readList(this.collection, (Collection__.class.getClassLoader()));
        in.readList(this.wpItems, (ir.omidtaheri.wpclient.data.network.model.Post_Types.WpItem__.class.getClassLoader()));
        in.readList(this.curies, (Cury__.class.getClassLoader()));
    }

    public Links__() {
    }

    public List<Collection__> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection__> collection) {
        this.collection = collection;
    }

    public Links__ withCollection(List<Collection__> collection) {
        this.collection = collection;
        return this;
    }

    public List<WpItem__> getWpItems() {
        return wpItems;
    }

    public void setWpItems(List<WpItem__> wpItems) {
        this.wpItems = wpItems;
    }

    public Links__ withWpItems(List<WpItem__> wpItems) {
        this.wpItems = wpItems;
        return this;
    }

    public List<Cury__> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury__> curies) {
        this.curies = curies;
    }

    public Links__ withCuries(List<Cury__> curies) {
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
