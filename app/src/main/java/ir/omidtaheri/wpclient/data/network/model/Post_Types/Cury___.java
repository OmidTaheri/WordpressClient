
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cury___ implements Parcelable
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
    public final static Creator<Cury___> CREATOR = new Creator<Cury___>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Cury___ createFromParcel(Parcel in) {
            return new Cury___(in);
        }

        public Cury___[] newArray(int size) {
            return (new Cury___[size]);
        }

    }
    ;

    protected Cury___(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
        this.templated = ((boolean) in.readValue((boolean.class.getClassLoader())));
    }

    public Cury___() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cury___ withName(String name) {
        this.name = name;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Cury___ withHref(String href) {
        this.href = href;
        return this;
    }

    public boolean isTemplated() {
        return templated;
    }

    public void setTemplated(boolean templated) {
        this.templated = templated;
    }

    public Cury___ withTemplated(boolean templated) {
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
