
package ir.omidtaheri.wpclient.data.network.model.Tags;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TagsResponse implements Parcelable
{

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Creator<TagsResponse> CREATOR = new Creator<TagsResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public TagsResponse createFromParcel(Parcel in) {
            return new TagsResponse(in);
        }

        public TagsResponse[] newArray(int size) {
            return (new TagsResponse[size]);
        }

    }
    ;

    protected TagsResponse(Parcel in) {
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.count = ((int) in.readValue((int.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.taxonomy = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.meta, (Object.class.getClassLoader()));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public TagsResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TagsResponse withId(int id) {
        this.id = id;
        return this;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TagsResponse withCount(int count) {
        this.count = count;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public TagsResponse withLink(String link) {
        this.link = link;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagsResponse withName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public TagsResponse withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public TagsResponse withTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public TagsResponse withMeta(List<Object> meta) {
        this.meta = meta;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public TagsResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(count);
        dest.writeValue(description);
        dest.writeValue(link);
        dest.writeValue(name);
        dest.writeValue(slug);
        dest.writeValue(taxonomy);
        dest.writeList(meta);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
