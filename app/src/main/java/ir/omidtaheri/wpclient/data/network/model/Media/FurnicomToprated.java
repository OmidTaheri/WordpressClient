
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FurnicomToprated implements Parcelable
{

    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("source_url")
    @Expose
    private String sourceUrl;
    public final static Creator<FurnicomToprated> CREATOR = new Creator<FurnicomToprated>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FurnicomToprated createFromParcel(Parcel in) {
            return new FurnicomToprated(in);
        }

        public FurnicomToprated[] newArray(int size) {
            return (new FurnicomToprated[size]);
        }

    }
    ;

    protected FurnicomToprated(Parcel in) {
        this.file = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((int) in.readValue((int.class.getClassLoader())));
        this.height = ((int) in.readValue((int.class.getClassLoader())));
        this.mimeType = ((String) in.readValue((String.class.getClassLoader())));
        this.sourceUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FurnicomToprated() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public FurnicomToprated withFile(String file) {
        this.file = file;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public FurnicomToprated withWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public FurnicomToprated withHeight(int height) {
        this.height = height;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public FurnicomToprated withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public FurnicomToprated withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(file);
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(mimeType);
        dest.writeValue(sourceUrl);
    }

    public int describeContents() {
        return  0;
    }

}
