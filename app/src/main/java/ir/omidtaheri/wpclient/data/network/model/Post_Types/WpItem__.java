
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpItem__ implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpItem__> CREATOR = new Creator<WpItem__>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpItem__ createFromParcel(Parcel in) {
            return new WpItem__(in);
        }

        public WpItem__[] newArray(int size) {
            return (new WpItem__[size]);
        }

    }
    ;

    protected WpItem__(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpItem__() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WpItem__ withHref(String href) {
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
