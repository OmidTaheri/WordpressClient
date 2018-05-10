
package ir.omidtaheri.wpclient.data.network.model.Pages;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links implements Parcelable
{

    @SerializedName("self")
    @Expose
    private List<Self> self = null;
    @SerializedName("collection")
    @Expose
    private List<Collection> collection = null;
    @SerializedName("about")
    @Expose
    private List<About> about = null;
    @SerializedName("author")
    @Expose
    private List<Author> author = null;
    @SerializedName("replies")
    @Expose
    private List<Reply> replies = null;
    @SerializedName("version-history")
    @Expose
    private List<VersionHistory> versionHistory = null;
    @SerializedName("wp:attachment")
    @Expose
    private List<WpAttachment> wpAttachment = null;
    @SerializedName("wp:term")
    @Expose
    private List<WpTerm> wpTerm = null;
    @SerializedName("curies")
    @Expose
    private List<Cury> curies = null;
    public final static Creator<Links> CREATOR = new Creator<Links>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links createFromParcel(Parcel in) {
            return new Links(in);
        }

        public Links[] newArray(int size) {
            return (new Links[size]);
        }

    }
    ;

    protected Links(Parcel in) {
        in.readList(this.self, (ir.omidtaheri.wpclient.data.network.model.Pages.Self.class.getClassLoader()));
        in.readList(this.collection, (Collection.class.getClassLoader()));
        in.readList(this.about, (About.class.getClassLoader()));
        in.readList(this.author, (Author.class.getClassLoader()));
        in.readList(this.replies, (ir.omidtaheri.wpclient.data.network.model.Pages.Reply.class.getClassLoader()));
        in.readList(this.versionHistory, (ir.omidtaheri.wpclient.data.network.model.Pages.VersionHistory.class.getClassLoader()));
        in.readList(this.wpAttachment, (ir.omidtaheri.wpclient.data.network.model.Pages.WpAttachment.class.getClassLoader()));
        in.readList(this.wpTerm, (ir.omidtaheri.wpclient.data.network.model.Pages.WpTerm.class.getClassLoader()));
        in.readList(this.curies, (Cury.class.getClassLoader()));
    }

    public Links() {
    }

    public List<Self> getSelf() {
        return self;
    }

    public void setSelf(List<Self> self) {
        this.self = self;
    }

    public Links withSelf(List<Self> self) {
        this.self = self;
        return this;
    }

    public List<Collection> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    public Links withCollection(List<Collection> collection) {
        this.collection = collection;
        return this;
    }

    public List<About> getAbout() {
        return about;
    }

    public void setAbout(List<About> about) {
        this.about = about;
    }

    public Links withAbout(List<About> about) {
        this.about = about;
        return this;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public Links withAuthor(List<Author> author) {
        this.author = author;
        return this;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public Links withReplies(List<Reply> replies) {
        this.replies = replies;
        return this;
    }

    public List<VersionHistory> getVersionHistory() {
        return versionHistory;
    }

    public void setVersionHistory(List<VersionHistory> versionHistory) {
        this.versionHistory = versionHistory;
    }

    public Links withVersionHistory(List<VersionHistory> versionHistory) {
        this.versionHistory = versionHistory;
        return this;
    }

    public List<WpAttachment> getWpAttachment() {
        return wpAttachment;
    }

    public void setWpAttachment(List<WpAttachment> wpAttachment) {
        this.wpAttachment = wpAttachment;
    }

    public Links withWpAttachment(List<WpAttachment> wpAttachment) {
        this.wpAttachment = wpAttachment;
        return this;
    }

    public List<WpTerm> getWpTerm() {
        return wpTerm;
    }

    public void setWpTerm(List<WpTerm> wpTerm) {
        this.wpTerm = wpTerm;
    }

    public Links withWpTerm(List<WpTerm> wpTerm) {
        this.wpTerm = wpTerm;
        return this;
    }

    public List<Cury> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    public Links withCuries(List<Cury> curies) {
        this.curies = curies;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(self);
        dest.writeList(collection);
        dest.writeList(about);
        dest.writeList(author);
        dest.writeList(replies);
        dest.writeList(versionHistory);
        dest.writeList(wpAttachment);
        dest.writeList(wpTerm);
        dest.writeList(curies);
    }

    public int describeContents() {
        return  0;
    }

}
