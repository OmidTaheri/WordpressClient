
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Guid implements Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    public final static Creator<Guid> CREATOR = new Creator<Guid>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Guid createFromParcel(Parcel in) {
            return new Guid(in);
        }

        public Guid[] newArray(int size) {
            return (new Guid[size]);
        }

    }
    ;

    protected Guid(Parcel in) {
        this.rendered = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Guid() {
    }

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public Guid withRendered(String rendered) {
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
