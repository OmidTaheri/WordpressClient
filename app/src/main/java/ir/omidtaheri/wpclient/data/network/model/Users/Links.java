
package ir.omidtaheri.wpclient.data.network.model.Users;

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
        in.readList(this.self, (ir.omidtaheri.wpclient.data.network.model.Users.Self.class.getClassLoader()));
        in.readList(this.collection, (Collection.class.getClassLoader()));
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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(self);
        dest.writeList(collection);
    }

    public int describeContents() {
        return  0;
    }

}
