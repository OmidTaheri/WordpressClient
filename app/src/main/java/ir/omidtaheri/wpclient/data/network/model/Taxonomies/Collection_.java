
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Collection_ implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<Collection_> CREATOR = new Creator<Collection_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Collection_ createFromParcel(Parcel in) {
            return new Collection_(in);
        }

        public Collection_[] newArray(int size) {
            return (new Collection_[size]);
        }

    }
    ;

    protected Collection_(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Collection_() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Collection_ withHref(String href) {
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
