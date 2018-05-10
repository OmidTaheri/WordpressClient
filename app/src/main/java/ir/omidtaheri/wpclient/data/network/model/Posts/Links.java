
package ir.omidtaheri.wpclient.data.network.model.Posts;

import java.util.ArrayList;
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
    @SerializedName("wp:featuredmedia")
    @Expose
    private List<WpFeaturedmedium> wpFeaturedmedia = null;
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

        if (in.readByte() == 0x01) {
            self = new ArrayList<Self>();
            in.readList(self, Self.class.getClassLoader());
        } else {
            self = null;
        }
        if (in.readByte() == 0x01) {
            collection = new ArrayList<Collection>();
            in.readList(collection, Collection.class.getClassLoader());
        } else {
            collection = null;
        }
        if (in.readByte() == 0x01) {
            about = new ArrayList<About>();
            in.readList(about, About.class.getClassLoader());
        } else {
            about = null;
        }
        if (in.readByte() == 0x01) {
            author = new ArrayList<Author>();
            in.readList(author, Author.class.getClassLoader());
        } else {
            author = null;
        }
        if (in.readByte() == 0x01) {
            replies = new ArrayList<Reply>();
            in.readList(replies, Reply.class.getClassLoader());
        } else {
            replies = null;
        }
        if (in.readByte() == 0x01) {
            versionHistory = new ArrayList<VersionHistory>();
            in.readList(versionHistory, VersionHistory.class.getClassLoader());
        } else {
            versionHistory = null;
        }
        if (in.readByte() == 0x01) {
            wpFeaturedmedia = new ArrayList<WpFeaturedmedium>();
            in.readList(wpFeaturedmedia, WpFeaturedmedium.class.getClassLoader());
        } else {
            wpFeaturedmedia = null;
        }
        if (in.readByte() == 0x01) {
            wpAttachment = new ArrayList<WpAttachment>();
            in.readList(wpAttachment, WpAttachment.class.getClassLoader());
        } else {
            wpAttachment = null;
        }
        if (in.readByte() == 0x01) {
            wpTerm = new ArrayList<WpTerm>();
            in.readList(wpTerm, WpTerm.class.getClassLoader());
        } else {
            wpTerm = null;
        }
        if (in.readByte() == 0x01) {
            curies = new ArrayList<Cury>();
            in.readList(curies, Cury.class.getClassLoader());
        } else {
            curies = null;
        }

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

    public List<WpFeaturedmedium> getWpFeaturedmedia() {
        return wpFeaturedmedia;
    }

    public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
    }

    public Links withWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
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
        if (self == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(self);
        }
        if (collection == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(collection);
        }
        if (about == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(about);
        }
        if (author == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(author);
        }
        if (replies == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(replies);
        }
        if (versionHistory == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(versionHistory);
        }
        if (wpFeaturedmedia == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(wpFeaturedmedia);
        }
        if (wpAttachment == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(wpAttachment);
        }
        if (wpTerm == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(wpTerm);
        }
        if (curies == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(curies);
        }
    }

    public int describeContents() {
        return  0;
    }

}
