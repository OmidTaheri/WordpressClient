
package ir.omidtaheri.wpclient.data.network.model.Post_Statuses ;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links implements Parcelable
{

    @SerializedName("archives")
    @Expose
    private List<Archive> archives = null;
    public final static Parcelable.Creator<Links> CREATOR = new Creator<Links>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links createFromParcel(Parcel in) {
            return new Links(in);
        }

        public Links[] newArray(int size) {
            return (new Links[size]);
        }

    }
    ;

    protected Links(Parcel in) {
        in.readList(this.archives, (ir.omidtaheri.wpclient.data.network.model.Post_Statuses.Archive.class.getClassLoader()));
    }

    public Links() {
    }

    public List<Archive> getArchives() {
        return archives;
    }

    public void setArchives(List<Archive> archives) {
        this.archives = archives;
    }

    public Links withArchives(List<Archive> archives) {
        this.archives = archives;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(archives);
    }

    public int describeContents() {
        return  0;
    }

}
