
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Collection__ implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<Collection__> CREATOR = new Creator<Collection__>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Collection__ createFromParcel(Parcel in) {
            return new Collection__(in);
        }

        public Collection__[] newArray(int size) {
            return (new Collection__[size]);
        }

    }
    ;

    protected Collection__(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Collection__() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Collection__ withHref(String href) {
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
