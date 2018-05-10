
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpItem implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpItem> CREATOR = new Creator<WpItem>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpItem createFromParcel(Parcel in) {
            return new WpItem(in);
        }

        public WpItem[] newArray(int size) {
            return (new WpItem[size]);
        }

    }
    ;

    protected WpItem(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpItem() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WpItem withHref(String href) {
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
