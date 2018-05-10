
package ir.omidtaheri.wpclient.data.network.model.Media;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageMeta implements Parcelable
{

    @SerializedName("aperture")
    @Expose
    private String aperture;
    @SerializedName("credit")
    @Expose
    private String credit;
    @SerializedName("camera")
    @Expose
    private String camera;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("created_timestamp")
    @Expose
    private String createdTimestamp;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("focal_length")
    @Expose
    private String focalLength;
    @SerializedName("iso")
    @Expose
    private String iso;
    @SerializedName("shutter_speed")
    @Expose
    private String shutterSpeed;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("orientation")
    @Expose
    private String orientation;
    @SerializedName("keywords")
    @Expose
    private List<Object> keywords = null;
    public final static Creator<ImageMeta> CREATOR = new Creator<ImageMeta>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ImageMeta createFromParcel(Parcel in) {
            return new ImageMeta(in);
        }

        public ImageMeta[] newArray(int size) {
            return (new ImageMeta[size]);
        }

    }
    ;

    protected ImageMeta(Parcel in) {
        this.aperture = ((String) in.readValue((String.class.getClassLoader())));
        this.credit = ((String) in.readValue((String.class.getClassLoader())));
        this.camera = ((String) in.readValue((String.class.getClassLoader())));
        this.caption = ((String) in.readValue((String.class.getClassLoader())));
        this.createdTimestamp = ((String) in.readValue((String.class.getClassLoader())));
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.focalLength = ((String) in.readValue((String.class.getClassLoader())));
        this.iso = ((String) in.readValue((String.class.getClassLoader())));
        this.shutterSpeed = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.orientation = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.keywords, (Object.class.getClassLoader()));
    }

    public ImageMeta() {
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    public ImageMeta withAperture(String aperture) {
        this.aperture = aperture;
        return this;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public ImageMeta withCredit(String credit) {
        this.credit = credit;
        return this;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public ImageMeta withCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ImageMeta withCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public ImageMeta withCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ImageMeta withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public ImageMeta withFocalLength(String focalLength) {
        this.focalLength = focalLength;
        return this;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public ImageMeta withIso(String iso) {
        this.iso = iso;
        return this;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public ImageMeta withShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageMeta withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public ImageMeta withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    public List<Object> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

    public ImageMeta withKeywords(List<Object> keywords) {
        this.keywords = keywords;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aperture);
        dest.writeValue(credit);
        dest.writeValue(camera);
        dest.writeValue(caption);
        dest.writeValue(createdTimestamp);
        dest.writeValue(copyright);
        dest.writeValue(focalLength);
        dest.writeValue(iso);
        dest.writeValue(shutterSpeed);
        dest.writeValue(title);
        dest.writeValue(orientation);
        dest.writeList(keywords);
    }

    public int describeContents() {
        return  0;
    }

}
