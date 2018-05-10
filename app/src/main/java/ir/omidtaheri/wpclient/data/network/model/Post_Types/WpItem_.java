
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpItem_ implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpItem_> CREATOR = new Creator<WpItem_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpItem_ createFromParcel(Parcel in) {
            return new WpItem_(in);
        }

        public WpItem_[] newArray(int size) {
            return (new WpItem_[size]);
        }

    }
    ;

    protected WpItem_(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpItem_() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WpItem_ withHref(String href) {
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
