
package ir.omidtaheri.wpclient.data.network.model.Posts;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpTerm implements Parcelable
{

    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("embeddable")
    @Expose
    private boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpTerm> CREATOR = new Creator<WpTerm>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpTerm createFromParcel(Parcel in) {
            return new WpTerm(in);
        }

        public WpTerm[] newArray(int size) {
            return (new WpTerm[size]);
        }

    }
    ;

    protected WpTerm(Parcel in) {
        this.taxonomy = ((String) in.readValue((String.class.getClassLoader())));
        this.embeddable = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpTerm() {
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public WpTerm withTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    public boolean isEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public WpTerm withEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WpTerm withHref(String href) {
        this.href = href;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(taxonomy);
        dest.writeValue(embeddable);
        dest.writeValue(href);
    }

    public int describeContents() {
        return  0;
    }

}
