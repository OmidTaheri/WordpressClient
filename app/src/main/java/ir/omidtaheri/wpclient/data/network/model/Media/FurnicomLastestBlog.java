
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FurnicomLastestBlog implements Parcelable
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
    public final static Creator<FurnicomLastestBlog> CREATOR = new Creator<FurnicomLastestBlog>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FurnicomLastestBlog createFromParcel(Parcel in) {
            return new FurnicomLastestBlog(in);
        }

        public FurnicomLastestBlog[] newArray(int size) {
            return (new FurnicomLastestBlog[size]);
        }

    }
    ;

    protected FurnicomLastestBlog(Parcel in) {
        this.file = ((String) in.readValue((String.class.getClassLoader())));
        this.width = ((int) in.readValue((int.class.getClassLoader())));
        this.height = ((int) in.readValue((int.class.getClassLoader())));
        this.mimeType = ((String) in.readValue((String.class.getClassLoader())));
        this.sourceUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FurnicomLastestBlog() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public FurnicomLastestBlog withFile(String file) {
        this.file = file;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public FurnicomLastestBlog withWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public FurnicomLastestBlog withHeight(int height) {
        this.height = height;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public FurnicomLastestBlog withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public FurnicomLastestBlog withSourceUrl(String sourceUrl) {
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
