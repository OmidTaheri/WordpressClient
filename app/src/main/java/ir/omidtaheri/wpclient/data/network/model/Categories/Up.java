
package ir.omidtaheri.wpclient.data.network.model.Categories;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Up implements Parcelable
{

    @SerializedName("embeddable")
    @Expose
    private boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<Up> CREATOR = new Creator<Up>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Up createFromParcel(Parcel in) {
            return new Up(in);
        }

        public Up[] newArray(int size) {
            return (new Up[size]);
        }

    }
    ;

    protected Up(Parcel in) {
        this.embeddable = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Up() {
    }

    public boolean isEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public Up withEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Up withHref(String href) {
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
