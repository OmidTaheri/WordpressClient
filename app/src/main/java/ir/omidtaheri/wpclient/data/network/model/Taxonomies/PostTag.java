
package ir.omidtaheri.wpclient.data.network.model.Taxonomies;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostTag implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("types")
    @Expose
    private List<String> types = null;
    @SerializedName("hierarchical")
    @Expose
    private boolean hierarchical;
    @SerializedName("rest_base")
    @Expose
    private String restBase;
    @SerializedName("_links")
    @Expose
    private Links_ links;
    public final static Creator<PostTag> CREATOR = new Creator<PostTag>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PostTag createFromParcel(Parcel in) {
            return new PostTag(in);
        }

        public PostTag[] newArray(int size) {
            return (new PostTag[size]);
        }

    }
    ;

    protected PostTag(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.types, (String.class.getClassLoader()));
        this.hierarchical = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.restBase = ((String) in.readValue((String.class.getClassLoader())));
        this.links = ((Links_) in.readValue((Links_.class.getClassLoader())));
    }

    public PostTag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostTag withName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public PostTag withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostTag withDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public PostTag withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public boolean isHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    public PostTag withHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
        return this;
    }

    public String getRestBase() {
        return restBase;
    }

    public void setRestBase(String restBase) {
        this.restBase = restBase;
    }

    public PostTag withRestBase(String restBase) {
        this.restBase = restBase;
        return this;
    }

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

    public PostTag withLinks(Links_ links) {
        this.links = links;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(slug);
        dest.writeValue(description);
        dest.writeList(types);
        dest.writeValue(hierarchical);
        dest.writeValue(restBase);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
