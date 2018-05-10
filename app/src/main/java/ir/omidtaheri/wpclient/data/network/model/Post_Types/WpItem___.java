
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpItem___ implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpItem___> CREATOR = new Creator<WpItem___>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpItem___ createFromParcel(Parcel in) {
            return new WpItem___(in);
        }

        public WpItem___[] newArray(int size) {
            return (new WpItem___[size]);
        }

    }
    ;

    protected WpItem___(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpItem___() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WpItem___ withHref(String href) {
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
