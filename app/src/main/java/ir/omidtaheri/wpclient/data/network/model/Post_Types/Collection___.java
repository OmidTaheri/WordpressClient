
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Collection___ implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<Collection___> CREATOR = new Creator<Collection___>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Collection___ createFromParcel(Parcel in) {
            return new Collection___(in);
        }

        public Collection___[] newArray(int size) {
            return (new Collection___[size]);
        }

    }
    ;

    protected Collection___(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Collection___() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Collection___ withHref(String href) {
        this.href = href;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(href);
    }

    public int describeContents() {
        return  0;
    }

}
