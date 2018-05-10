
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaDetails implements Parcelable
{

    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("sizes")
    @Expose
    private Sizes sizes;
    @SerializedName("image_meta")
    @Expose
    private ImageMeta imageMeta;
    public final static Creator<MediaDetails> CREATOR = new Creator<MediaDetails>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MediaDetails createFromParcel(Parcel in) {
            return new MediaDetails(in);
        }

        public MediaDetails[] newArray(int size) {
            return (new MediaDetails[size]);
        }

    }
    ;

    protected MediaDetails(Parcel in) {
        this.width = ((int) in.readValue((int.class.getClassLoader())));
        this.height = ((int) in.readValue((int.class.getClassLoader())));
        this.file = ((String) in.readValue((String.class.getClassLoader())));
        this.sizes = ((Sizes) in.readValue((Sizes.class.getClassLoader())));
        this.imageMeta = ((ImageMeta) in.readValue((ImageMeta.class.getClassLoader())));
    }

    public MediaDetails() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public MediaDetails withWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MediaDetails withHeight(int height) {
        this.height = height;
        return this;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public MediaDetails withFile(String file) {
        this.file = file;
        return this;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public MediaDetails withSizes(Sizes sizes) {
        this.sizes = sizes;
        return this;
    }

    public ImageMeta getImageMeta() {
        return imageMeta;
    }

    public void setImageMeta(ImageMeta imageMeta) {
        this.imageMeta = imageMeta;
    }

    public MediaDetails withImageMeta(ImageMeta imageMeta) {
        this.imageMeta = imageMeta;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(file);
        dest.writeValue(sizes);
        dest.writeValue(imageMeta);
    }

    public int describeContents() {
        return  0;
    }

}
