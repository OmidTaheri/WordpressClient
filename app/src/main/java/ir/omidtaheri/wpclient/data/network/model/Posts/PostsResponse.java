
package ir.omidtaheri.wpclient.data.network.model.Posts;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostsResponse implements Parcelable
{

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private int author;
    @SerializedName("featured_media")
    @Expose
    private int featuredMedia;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("sticky")
    @Expose
    private boolean sticky;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Integer> tags = null;
    @SerializedName("ps_author_name")
    @Expose
    private String psAuthorName;
    @SerializedName("featured_image_src")
    @Expose
    private String featuredImageSrc;

    @SerializedName("post_categories")
    @Expose
    private List<PostCategory> postCategories = null;
    @SerializedName("post_tags")
    @Expose
    private List<PostTag> postTags = null;

    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Creator<PostsResponse> CREATOR = new Creator<PostsResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PostsResponse createFromParcel(Parcel in) {
            return new PostsResponse(in);
        }

        public PostsResponse[] newArray(int size) {
            return (new PostsResponse[size]);
        }

    }
    ;

    protected PostsResponse(Parcel in) {
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.date = ((String) in.readValue((String.class.getClassLoader())));
        this.dateGmt = ((String) in.readValue((String.class.getClassLoader())));
        this.guid = ((Guid) in.readValue((Guid.class.getClassLoader())));
        this.modified = ((String) in.readValue((String.class.getClassLoader())));
        this.modifiedGmt = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((Title) in.readValue((Title.class.getClassLoader())));
        this.content = ((Content) in.readValue((Content.class.getClassLoader())));
        this.excerpt = ((Excerpt) in.readValue((Excerpt.class.getClassLoader())));
        this.author = ((int) in.readValue((int.class.getClassLoader())));
        this.featuredMedia = ((int) in.readValue((int.class.getClassLoader())));
        this.commentStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.pingStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.sticky = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.template = ((String) in.readValue((String.class.getClassLoader())));
        this.format = ((String) in.readValue((String.class.getClassLoader())));
        ////
        if (in.readByte() == 0x01) {
            this.meta = new ArrayList<Object>();
            in.readList( this.meta, Object.class.getClassLoader());
        } else {
            this.meta = null;
        }
        if (in.readByte() == 0x01) {
            this.categories = new ArrayList<Integer>();
            in.readList( this.categories, Integer.class.getClassLoader());
        } else {
            this.categories = null;
        }
        if (in.readByte() == 0x01) {
            this.tags = new ArrayList<Integer>();
            in.readList( this.tags, Integer.class.getClassLoader());
        } else {
            this.tags = null;
        }

        if (in.readByte() == 0x01) {
            postCategories = new ArrayList<PostCategory>();
            in.readList(postCategories, PostCategory.class.getClassLoader());
        } else {
            postCategories = null;
        }
        if (in.readByte() == 0x01) {
            postTags = new ArrayList<PostTag>();
            in.readList(postTags, PostTag.class.getClassLoader());
        } else {
            postTags = null;
        }

        /////
        this.psAuthorName = ((String) in.readValue((String.class.getClassLoader())));
        this.featuredImageSrc = ((String) in.readValue((String.class.getClassLoader())));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public PostsResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PostsResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PostsResponse withDate(String date) {
        this.date = date;
        return this;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public PostsResponse withDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
        return this;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public PostsResponse withGuid(Guid guid) {
        this.guid = guid;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public PostsResponse withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public PostsResponse withModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public PostsResponse withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PostsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PostsResponse withType(String type) {
        this.type = type;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PostsResponse withLink(String link) {
        this.link = link;
        return this;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public PostsResponse withTitle(Title title) {
        this.title = title;
        return this;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public PostsResponse withContent(Content content) {
        this.content = content;
        return this;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public PostsResponse withExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public PostsResponse withAuthor(int author) {
        this.author = author;
        return this;
    }

    public int getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(int featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public PostsResponse withFeaturedMedia(int featuredMedia) {
        this.featuredMedia = featuredMedia;
        return this;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public PostsResponse withCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public PostsResponse withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public PostsResponse withSticky(boolean sticky) {
        this.sticky = sticky;
        return this;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public PostsResponse withTemplate(String template) {
        this.template = template;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public PostsResponse withFormat(String format) {
        this.format = format;
        return this;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public PostsResponse withMeta(List<Object> meta) {
        this.meta = meta;
        return this;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public PostsResponse withCategories(List<Integer> categories) {
        this.categories = categories;
        return this;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    public PostsResponse withTags(List<Integer> tags) {
        this.tags = tags;
        return this;
    }

    public String getPsAuthorName() {
        return psAuthorName;
    }

    public void setPsAuthorName(String psAuthorName) {
        this.psAuthorName = psAuthorName;
    }

    public PostsResponse withPsAuthorName(String psAuthorName) {
        this.psAuthorName = psAuthorName;
        return this;
    }

    public String getFeaturedImageSrc() {
        return featuredImageSrc;
    }

    public void setFeaturedImageSrc(String featuredImageSrc) {
        this.featuredImageSrc = featuredImageSrc;
    }

    public PostsResponse withFeaturedImageSrc(String featuredImageSrc) {
        this.featuredImageSrc = featuredImageSrc;
        return this;
    }


    public List<PostCategory> getPostCategories() {
        return postCategories;
    }

    public void setPostCategories(List<PostCategory> postCategories) {
        this.postCategories = postCategories;
    }

    public PostsResponse withPostCategories(List<PostCategory> postCategories) {
        this.postCategories = postCategories;
        return this;
    }

    public List<PostTag> getPostTags() {
        return postTags;
    }

    public void setPostTags(List<PostTag> postTags) {
        this.postTags = postTags;
    }

    public PostsResponse withPostTags(List<PostTag> postTags) {
        this.postTags = postTags;
        return this;
    }


    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public PostsResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(date);
        dest.writeValue(dateGmt);
        dest.writeValue(guid);
        dest.writeValue(modified);
        dest.writeValue(modifiedGmt);
        dest.writeValue(slug);
        dest.writeValue(status);
        dest.writeValue(type);
        dest.writeValue(link);
        dest.writeValue(title);
        dest.writeValue(content);
        dest.writeValue(excerpt);
        dest.writeValue(author);
        dest.writeValue(featuredMedia);
        dest.writeValue(commentStatus);
        dest.writeValue(pingStatus);
        dest.writeValue(sticky);
        dest.writeValue(template);
        dest.writeValue(format);
        ////////
        if (meta == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(meta);
        }
        if (categories == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(categories);
        }
        if (tags == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(tags);
        }

        if (postCategories == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(postCategories);
        }
        if (postTags == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(postTags);
        }

        ////
        dest.writeValue(psAuthorName);
        dest.writeValue(featuredImageSrc);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
