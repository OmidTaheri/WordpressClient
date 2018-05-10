
package ir.omidtaheri.wpclient.data.network.model.Pages;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PagesResponse implements Parcelable
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
    @SerializedName("parent")
    @Expose
    private int parent;
    @SerializedName("menu_order")
    @Expose
    private int menuOrder;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("categories")
    @Expose
    private List<Object> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Creator<PagesResponse> CREATOR = new Creator<PagesResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PagesResponse createFromParcel(Parcel in) {
            return new PagesResponse(in);
        }

        public PagesResponse[] newArray(int size) {
            return (new PagesResponse[size]);
        }

    }
    ;

    protected PagesResponse(Parcel in) {
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
        this.parent = ((int) in.readValue((int.class.getClassLoader())));
        this.menuOrder = ((int) in.readValue((int.class.getClassLoader())));
        this.commentStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.pingStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.template = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.meta, (Object.class.getClassLoader()));
        in.readList(this.categories, (Object.class.getClassLoader()));
        in.readList(this.tags, (Object.class.getClassLoader()));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public PagesResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PagesResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PagesResponse withDate(String date) {
        this.date = date;
        return this;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public PagesResponse withDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
        return this;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public PagesResponse withGuid(Guid guid) {
        this.guid = guid;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public PagesResponse withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public PagesResponse withModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public PagesResponse withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PagesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PagesResponse withType(String type) {
        this.type = type;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PagesResponse withLink(String link) {
        this.link = link;
        return this;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public PagesResponse withTitle(Title title) {
        this.title = title;
        return this;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public PagesResponse withContent(Content content) {
        this.content = content;
        return this;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public PagesResponse withExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public PagesResponse withAuthor(int author) {
        this.author = author;
        return this;
    }

    public int getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(int featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public PagesResponse withFeaturedMedia(int featuredMedia) {
        this.featuredMedia = featuredMedia;
        return this;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public PagesResponse withParent(int parent) {
        this.parent = parent;
        return this;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public PagesResponse withMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
        return this;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public PagesResponse withCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public PagesResponse withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public PagesResponse withTemplate(String template) {
        this.template = template;
        return this;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public PagesResponse withMeta(List<Object> meta) {
        this.meta = meta;
        return this;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public PagesResponse withCategories(List<Object> categories) {
        this.categories = categories;
        return this;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public PagesResponse withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public PagesResponse withLinks(Links links) {
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
        dest.writeValue(parent);
        dest.writeValue(menuOrder);
        dest.writeValue(commentStatus);
        dest.writeValue(pingStatus);
        dest.writeValue(template);
        dest.writeList(meta);
        dest.writeList(categories);
        dest.writeList(tags);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
