
package ir.omidtaheri.wpclient.data.network.model.Users;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvatarUrls implements Parcelable
{

    @SerializedName("24")
    @Expose
    private String _24;
    @SerializedName("48")
    @Expose
    private String _48;
    @SerializedName("96")
    @Expose
    private String _96;
    public final static Creator<AvatarUrls> CREATOR = new Creator<AvatarUrls>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AvatarUrls createFromParcel(Parcel in) {
            return new AvatarUrls(in);
        }

        public AvatarUrls[] newArray(int size) {
            return (new AvatarUrls[size]);
        }

    }
    ;

    protected AvatarUrls(Parcel in) {
        this._24 = ((String) in.readValue((String.class.getClassLoader())));
        this._48 = ((String) in.readValue((String.class.getClassLoader())));
        this._96 = ((String) in.readValue((String.class.getClassLoader())));
    }

    public AvatarUrls() {
    }

    public String get24() {
        return _24;
    }

    public void set24(String _24) {
        this._24 = _24;
    }

    public AvatarUrls with24(String _24) {
        this._24 = _24;
        return this;
    }

    public String get48() {
        return _48;
    }

    public void set48(String _48) {
        this._48 = _48;
    }

    public AvatarUrls with48(String _48) {
        this._48 = _48;
        return this;
    }

    public String get96() {
        return _96;
    }

    public void set96(String _96) {
        this._96 = _96;
    }

    public AvatarUrls with96(String _96) {
        this._96 = _96;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(_24);
        dest.writeValue(_48);
        dest.writeValue(_96);
    }

    public int describeContents() {
        return  0;
    }

}
