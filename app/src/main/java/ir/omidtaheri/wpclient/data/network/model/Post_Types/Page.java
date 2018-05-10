
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Page implements Parcelable
{

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("hierarchical")
    @Expose
    private boolean hierarchical;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("taxonomies")
    @Expose
    private List<String> taxonomies = null;
    @SerializedName("rest_base")
    @Expose
    private String restBase;
    @SerializedName("_links")
    @Expose
    private Links_ links;
    public final static Creator<Page> CREATOR = new Creator<Page>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Page createFromParcel(Parcel in) {
            return new Page(in);
        }

        public Page[] newArray(int size) {
            return (new Page[size]);
        }

    }
    ;

    protected Page(Parcel in) {
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.hierarchical = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.taxonomies, (String.class.getClassLoader()));
        this.restBase = ((String) in.readValue((String.class.getClassLoader())));
        this.links = ((Links_) in.readValue((Links_.class.getClassLoader())));
    }

    public Page() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Page withDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    public Page withHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Page withName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Page withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public List<String> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<String> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public Page withTaxonomies(List<String> taxonomies) {
        this.taxonomies = taxonomies;
        return this;
    }

    public String getRestBase() {
        return restBase;
    }

    public void setRestBase(String restBase) {
        this.restBase = restBase;
    }

    public Page withRestBase(String restBase) {
        this.restBase = restBase;
        return this;
    }

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

    public Page withLinks(Links_ links) {
        this.links = links;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(description);
        dest.writeValue(hierarchical);
        dest.writeValue(name);
        dest.writeValue(slug);
        dest.writeList(taxonomies);
        dest.writeValue(restBase);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
