
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cury_ implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("templated")
    @Expose
    private boolean templated;
    public final static Creator<Cury_> CREATOR = new Creator<Cury_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Cury_ createFromParcel(Parcel in) {
            return new Cury_(in);
        }

        public Cury_[] newArray(int size) {
            return (new Cury_[size]);
        }

    }
    ;

    protected Cury_(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
        this.templated = ((boolean) in.readValue((boolean.class.getClassLoader())));
    }

    public Cury_() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cury_ withName(String name) {
        this.name = name;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Cury_ withHref(String href) {
        this.href = href;
        return this;
    }

    public boolean isTemplated() {
        return templated;
    }

    public void setTemplated(boolean templated) {
        this.templated = templated;
    }

    public Cury_ withTemplated(boolean templated) {
        this.templated = templated;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(href);
        dest.writeValue(templated);
    }

    public int describeContents() {
        return  0;
    }

}
