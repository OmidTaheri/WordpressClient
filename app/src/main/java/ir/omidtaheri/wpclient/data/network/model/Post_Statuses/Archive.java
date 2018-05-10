
package ir.omidtaheri.wpclient.data.network.model.Post_Statuses;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Archive implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Parcelable.Creator<Archive> CREATOR = new Creator<Archive>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Archive createFromParcel(Parcel in) {
            return new Archive(in);
        }

        public Archive[] newArray(int size) {
            return (new Archive[size]);
        }

    }
    ;

    protected Archive(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Archive() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Archive withHref(String href) {
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
