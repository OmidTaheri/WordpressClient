
package ir.omidtaheri.wpclient.data.network.model.Pages;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VersionHistory implements Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<VersionHistory> CREATOR = new Creator<VersionHistory>() {


        @SuppressWarnings({
            "unchecked"
        })
        public VersionHistory createFromParcel(Parcel in) {
            return new VersionHistory(in);
        }

        public VersionHistory[] newArray(int size) {
            return (new VersionHistory[size]);
        }

    }
    ;

    protected VersionHistory(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public VersionHistory() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public VersionHistory withHref(String href) {
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
