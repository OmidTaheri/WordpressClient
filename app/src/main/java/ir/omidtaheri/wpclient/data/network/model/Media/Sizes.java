
package ir.omidtaheri.wpclient.data.network.model.Media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes implements Parcelable
{

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("medium")
    @Expose
    private Medium medium;
    @SerializedName("furnicom_lastest_blog")
    @Expose
    private FurnicomLastestBlog furnicomLastestBlog;
    @SerializedName("furnicom_toprated")
    @Expose
    private FurnicomToprated furnicomToprated;
    @SerializedName("furnicom_latest_news")
    @Expose
    private FurnicomLatestNews furnicomLatestNews;
    @SerializedName("furnicom_latest_right")
    @Expose
    private FurnicomLatestRight furnicomLatestRight;
    @SerializedName("furnicom_countdown")
    @Expose
    private FurnicomCountdown furnicomCountdown;
    @SerializedName("shop_thumbnail")
    @Expose
    private ShopThumbnail shopThumbnail;
    @SerializedName("shop_catalog")
    @Expose
    private ShopCatalog shopCatalog;
    @SerializedName("full")
    @Expose
    private Full full;
    @SerializedName("medium_large")
    @Expose
    private MediumLarge mediumLarge;
    @SerializedName("shop_single")
    @Expose
    private ShopSingle shopSingle;
    public final static Creator<Sizes> CREATOR = new Creator<Sizes>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Sizes createFromParcel(Parcel in) {
            return new Sizes(in);
        }

        public Sizes[] newArray(int size) {
            return (new Sizes[size]);
        }

    }
    ;

    protected Sizes(Parcel in) {
        this.thumbnail = ((Thumbnail) in.readValue((Thumbnail.class.getClassLoader())));
        this.medium = ((Medium) in.readValue((Medium.class.getClassLoader())));
        this.furnicomLastestBlog = ((FurnicomLastestBlog) in.readValue((FurnicomLastestBlog.class.getClassLoader())));
        this.furnicomToprated = ((FurnicomToprated) in.readValue((FurnicomToprated.class.getClassLoader())));
        this.furnicomLatestNews = ((FurnicomLatestNews) in.readValue((FurnicomLatestNews.class.getClassLoader())));
        this.furnicomLatestRight = ((FurnicomLatestRight) in.readValue((FurnicomLatestRight.class.getClassLoader())));
        this.furnicomCountdown = ((FurnicomCountdown) in.readValue((FurnicomCountdown.class.getClassLoader())));
        this.shopThumbnail = ((ShopThumbnail) in.readValue((ShopThumbnail.class.getClassLoader())));
        this.shopCatalog = ((ShopCatalog) in.readValue((ShopCatalog.class.getClassLoader())));
        this.full = ((Full) in.readValue((Full.class.getClassLoader())));
        this.mediumLarge = ((MediumLarge) in.readValue((MediumLarge.class.getClassLoader())));
        this.shopSingle = ((ShopSingle) in.readValue((ShopSingle.class.getClassLoader())));
    }

    public Sizes() {
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Sizes withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Sizes withMedium(Medium medium) {
        this.medium = medium;
        return this;
    }

    public FurnicomLastestBlog getFurnicomLastestBlog() {
        return furnicomLastestBlog;
    }

    public void setFurnicomLastestBlog(FurnicomLastestBlog furnicomLastestBlog) {
        this.furnicomLastestBlog = furnicomLastestBlog;
    }

    public Sizes withFurnicomLastestBlog(FurnicomLastestBlog furnicomLastestBlog) {
        this.furnicomLastestBlog = furnicomLastestBlog;
        return this;
    }

    public FurnicomToprated getFurnicomToprated() {
        return furnicomToprated;
    }

    public void setFurnicomToprated(FurnicomToprated furnicomToprated) {
        this.furnicomToprated = furnicomToprated;
    }

    public Sizes withFurnicomToprated(FurnicomToprated furnicomToprated) {
        this.furnicomToprated = furnicomToprated;
        return this;
    }

    public FurnicomLatestNews getFurnicomLatestNews() {
        return furnicomLatestNews;
    }

    public void setFurnicomLatestNews(FurnicomLatestNews furnicomLatestNews) {
        this.furnicomLatestNews = furnicomLatestNews;
    }

    public Sizes withFurnicomLatestNews(FurnicomLatestNews furnicomLatestNews) {
        this.furnicomLatestNews = furnicomLatestNews;
        return this;
    }

    public FurnicomLatestRight getFurnicomLatestRight() {
        return furnicomLatestRight;
    }

    public void setFurnicomLatestRight(FurnicomLatestRight furnicomLatestRight) {
        this.furnicomLatestRight = furnicomLatestRight;
    }

    public Sizes withFurnicomLatestRight(FurnicomLatestRight furnicomLatestRight) {
        this.furnicomLatestRight = furnicomLatestRight;
        return this;
    }

    public FurnicomCountdown getFurnicomCountdown() {
        return furnicomCountdown;
    }

    public void setFurnicomCountdown(FurnicomCountdown furnicomCountdown) {
        this.furnicomCountdown = furnicomCountdown;
    }

    public Sizes withFurnicomCountdown(FurnicomCountdown furnicomCountdown) {
        this.furnicomCountdown = furnicomCountdown;
        return this;
    }

    public ShopThumbnail getShopThumbnail() {
        return shopThumbnail;
    }

    public void setShopThumbnail(ShopThumbnail shopThumbnail) {
        this.shopThumbnail = shopThumbnail;
    }

    public Sizes withShopThumbnail(ShopThumbnail shopThumbnail) {
        this.shopThumbnail = shopThumbnail;
        return this;
    }

    public ShopCatalog getShopCatalog() {
        return shopCatalog;
    }

    public void setShopCatalog(ShopCatalog shopCatalog) {
        this.shopCatalog = shopCatalog;
    }

    public Sizes withShopCatalog(ShopCatalog shopCatalog) {
        this.shopCatalog = shopCatalog;
        return this;
    }

    public Full getFull() {
        return full;
    }

    public void setFull(Full full) {
        this.full = full;
    }

    public Sizes withFull(Full full) {
        this.full = full;
        return this;
    }

    public MediumLarge getMediumLarge() {
        return mediumLarge;
    }

    public void setMediumLarge(MediumLarge mediumLarge) {
        this.mediumLarge = mediumLarge;
    }

    public Sizes withMediumLarge(MediumLarge mediumLarge) {
        this.mediumLarge = mediumLarge;
        return this;
    }

    public ShopSingle getShopSingle() {
        return shopSingle;
    }

    public void setShopSingle(ShopSingle shopSingle) {
        this.shopSingle = shopSingle;
    }

    public Sizes withShopSingle(ShopSingle shopSingle) {
        this.shopSingle = shopSingle;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(thumbnail);
        dest.writeValue(medium);
        dest.writeValue(furnicomLastestBlog);
        dest.writeValue(furnicomToprated);
        dest.writeValue(furnicomLatestNews);
        dest.writeValue(furnicomLatestRight);
        dest.writeValue(furnicomCountdown);
        dest.writeValue(shopThumbnail);
        dest.writeValue(shopCatalog);
        dest.writeValue(full);
        dest.writeValue(mediumLarge);
        dest.writeValue(shopSingle);
    }

    public int describeContents() {
        return  0;
    }

}
