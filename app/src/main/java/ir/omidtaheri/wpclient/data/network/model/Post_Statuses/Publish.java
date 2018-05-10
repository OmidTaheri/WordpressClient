
package ir.omidtaheri.wpclient.data.network.model.Post_Statuses;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Publish implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("public")
    @Expose
    private boolean _public;
    @SerializedName("queryable")
    @Expose
    private boolean queryable;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Parcelable.Creator<Publish> CREATOR = new Creator<Publish>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Publish createFromParcel(Parcel in) {
            return new Publish(in);
        }

        public Publish[] newArray(int size) {
            return (new Publish[size]);
        }

    }
    ;

    protected Publish(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this._public = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.queryable = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public Publish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publish withName(String name) {
        this.name = name;
        return this;
    }

    public boolean isPublic() {
        return _public;
    }

    public void setPublic(boolean _public) {
        this._public = _public;
    }

    public Publish withPublic(boolean _public) {
        this._public = _public;
        return this;
    }

    public boolean isQueryable() {
        return queryable;
    }

    public void setQueryable(boolean queryable) {
        this.queryable = queryable;
    }

    public Publish withQueryable(boolean queryable) {
        this.queryable = queryable;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Publish withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Publish withLinks(Links links) {
        this.links = links;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(_public);
        dest.writeValue(queryable);
        dest.writeValue(slug);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
