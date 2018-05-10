
package ir.omidtaheri.wpclient.data.network.model.Pages;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Excerpt implements Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    @SerializedName("protected")
    @Expose
    private boolean _protected;
    public final static Creator<Excerpt> CREATOR = new Creator<Excerpt>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Excerpt createFromParcel(Parcel in) {
            return new Excerpt(in);
        }

        public Excerpt[] newArray(int size) {
            return (new Excerpt[size]);
        }

    }
    ;

    protected Excerpt(Parcel in) {
        this.rendered = ((String) in.readValue((String.class.getClassLoader())));
        this._protected = ((boolean) in.readValue((boolean.class.getClassLoader())));
    }

    public Excerpt() {
    }

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public Excerpt withRendered(String rendered) {
        this.rendered = rendered;
        return this;
    }

    public boolean isProtected() {
        return _protected;
    }

    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    public Excerpt withProtected(boolean _protected) {
        this._protected = _protected;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rendered);
        dest.writeValue(_protected);
    }

    public int describeContents() {
        return  0;
    }

}
