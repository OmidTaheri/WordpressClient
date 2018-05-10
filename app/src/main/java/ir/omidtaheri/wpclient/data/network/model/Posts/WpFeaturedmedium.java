
package ir.omidtaheri.wpclient.data.network.model.Posts;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpFeaturedmedium implements Parcelable
{

    @SerializedName("embeddable")
    @Expose
    private boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpFeaturedmedium> CREATOR = new Creator<WpFeaturedmedium>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpFeaturedmedium createFromParcel(Parcel in) {
            return new WpFeaturedmedium(in);
        }

        public WpFeaturedmedium[] newArray(int size) {
            return (new WpFeaturedmedium[size]);
        }

    }
    ;

    protected WpFeaturedmedium(Parcel in) {
        this.embeddable = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpFeaturedmedium() {
    }

    public boolean isEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public WpFeaturedmedium withEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WpFeaturedmedium withHref(String href) {
        this.href = href;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(embeddable);
        dest.writeValue(href);
    }

    public int describeContents() {
        return  0;
    }

}
