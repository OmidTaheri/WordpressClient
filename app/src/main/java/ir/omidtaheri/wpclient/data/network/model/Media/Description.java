
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description implements Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    public final static Creator<Description> CREATOR = new Creator<Description>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Description createFromParcel(Parcel in) {
            return new Description(in);
        }

        public Description[] newArray(int size) {
            return (new Description[size]);
        }

    }
    ;

    protected Description(Parcel in) {
        this.rendered = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Description() {
    }

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public Description withRendered(String rendered) {
        this.rendered = rendered;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rendered);
    }

    public int describeContents() {
        return  0;
    }

}
