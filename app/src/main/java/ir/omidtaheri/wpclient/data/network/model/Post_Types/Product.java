
package ir.omidtaheri.wpclient.data.network.model.Post_Types;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Parcelable
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
    private List<Object> taxonomies = null;
    @SerializedName("rest_base")
    @Expose
    private String restBase;
    @SerializedName("_links")
    @Expose
    private Links___ links;
    public final static Creator<Product> CREATOR = new Creator<Product>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return (new Product[size]);
        }

    }
    ;

    protected Product(Parcel in) {
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.hierarchical = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.taxonomies, (Object.class.getClassLoader()));
        this.restBase = ((String) in.readValue((String.class.getClassLoader())));
        this.links = ((Links___) in.readValue((Links___.class.getClassLoader())));
    }

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product withDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    public Product withHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Product withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public List<Object> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<Object> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public Product withTaxonomies(List<Object> taxonomies) {
        this.taxonomies = taxonomies;
        return this;
    }

    public String getRestBase() {
        return restBase;
    }

    public void setRestBase(String restBase) {
        this.restBase = restBase;
    }

    public Product withRestBase(String restBase) {
        this.restBase = restBase;
        return this;
    }

    public Links___ getLinks() {
        return links;
    }

    public void setLinks(Links___ links) {
        this.links = links;
    }

    public Product withLinks(Links___ links) {
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
