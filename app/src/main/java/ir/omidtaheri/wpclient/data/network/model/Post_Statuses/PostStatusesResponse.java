
package ir.omidtaheri.wpclient.data.network.model.Post_Statuses;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostStatusesResponse implements Parcelable
{

    @SerializedName("publish")
    @Expose
    private Publish publish;
    public final static Parcelable.Creator<PostStatusesResponse> CREATOR = new Creator<PostStatusesResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PostStatusesResponse createFromParcel(Parcel in) {
            return new PostStatusesResponse(in);
        }

        public PostStatusesResponse[] newArray(int size) {
            return (new PostStatusesResponse[size]);
        }

    }
    ;

    protected PostStatusesResponse(Parcel in) {
        this.publish = ((Publish) in.readValue((Publish.class.getClassLoader())));
    }

    public PostStatusesResponse() {
    }

    public Publish getPublish() {
        return publish;
    }

    public void setPublish(Publish publish) {
        this.publish = publish;
    }

    public PostStatusesResponse withPublish(Publish publish) {
        this.publish = publish;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(publish);
    }

    public int describeContents() {
        return  0;
    }

}
