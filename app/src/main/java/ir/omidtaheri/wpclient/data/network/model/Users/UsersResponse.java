
package ir.omidtaheri.wpclient.data.network.model.Users;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsersResponse implements Parcelable
{

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("avatar_urls")
    @Expose
    private AvatarUrls avatarUrls;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Creator<UsersResponse> CREATOR = new Creator<UsersResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public UsersResponse createFromParcel(Parcel in) {
            return new UsersResponse(in);
        }

        public UsersResponse[] newArray(int size) {
            return (new UsersResponse[size]);
        }

    }
    ;

    protected UsersResponse(Parcel in) {
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.avatarUrls = ((AvatarUrls) in.readValue((AvatarUrls.class.getClassLoader())));
        in.readList(this.meta, (Object.class.getClassLoader()));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public UsersResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsersResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UsersResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UsersResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public UsersResponse withLink(String link) {
        this.link = link;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public UsersResponse withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public AvatarUrls getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public UsersResponse withAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
        return this;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public UsersResponse withMeta(List<Object> meta) {
        this.meta = meta;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public UsersResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(url);
        dest.writeValue(description);
        dest.writeValue(link);
        dest.writeValue(slug);
        dest.writeValue(avatarUrls);
        dest.writeList(meta);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
