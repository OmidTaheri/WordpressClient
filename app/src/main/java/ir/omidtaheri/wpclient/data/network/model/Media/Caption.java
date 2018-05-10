
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Caption implements Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    public final static Creator<Caption> CREATOR = new Creator<Caption>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Caption createFromParcel(Parcel in) {
            return new Caption(in);
        }

        public Caption[] newArray(int size) {
            return (new Caption[size]);
        }

    }
    ;

    protected Caption(Parcel in) {
        this.rendered = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Caption() {
    }

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public Caption withRendered(String rendered) {
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
