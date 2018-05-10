
package ir.omidtaheri.wpclient.data.network.model.Media;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaResponse implements Parcelable
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
    @SerializedName("author")
    @Expose
    private int author;
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
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("caption")
    @Expose
    private Caption caption;
    @SerializedName("alt_text")
    @Expose
    private String altText;
    @SerializedName("media_type")
    @Expose
    private String mediaType;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("media_details")
    @Expose
    private MediaDetails mediaDetails;
    @SerializedName("post")
    @Expose
    private Object post;
    @SerializedName("source_url")
    @Expose
    private String sourceUrl;
    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Creator<MediaResponse> CREATOR = new Creator<MediaResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MediaResponse createFromParcel(Parcel in) {
            return new MediaResponse(in);
        }

        public MediaResponse[] newArray(int size) {
            return (new MediaResponse[size]);
        }

    }
    ;

    protected MediaResponse(Parcel in) {
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
        this.author = ((int) in.readValue((int.class.getClassLoader())));
        this.commentStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.pingStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.template = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.meta, (Object.class.getClassLoader()));
        this.description = ((Description) in.readValue((Description.class.getClassLoader())));
        this.caption = ((Caption) in.readValue((Caption.class.getClassLoader())));
        this.altText = ((String) in.readValue((String.class.getClassLoader())));
        this.mediaType = ((String) in.readValue((String.class.getClassLoader())));
        this.mimeType = ((String) in.readValue((String.class.getClassLoader())));
        this.mediaDetails = ((MediaDetails) in.readValue((MediaDetails.class.getClassLoader())));
        this.post = ((Object) in.readValue((Object.class.getClassLoader())));
        this.sourceUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public MediaResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MediaResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MediaResponse withDate(String date) {
        this.date = date;
        return this;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public MediaResponse withDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
        return this;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public MediaResponse withGuid(Guid guid) {
        this.guid = guid;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public MediaResponse withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public MediaResponse withModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public MediaResponse withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MediaResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MediaResponse withType(String type) {
        this.type = type;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public MediaResponse withLink(String link) {
        this.link = link;
        return this;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public MediaResponse withTitle(Title title) {
        this.title = title;
        return this;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public MediaResponse withAuthor(int author) {
        this.author = author;
        return this;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public MediaResponse withCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
        return this;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public MediaResponse withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public MediaResponse withTemplate(String template) {
        this.template = template;
        return this;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public MediaResponse withMeta(List<Object> meta) {
        this.meta = meta;
        return this;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public MediaResponse withDescription(Description description) {
        this.description = description;
        return this;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public MediaResponse withCaption(Caption caption) {
        this.caption = caption;
        return this;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public MediaResponse withAltText(String altText) {
        this.altText = altText;
        return this;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public MediaResponse withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public MediaResponse withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public MediaDetails getMediaDetails() {
        return mediaDetails;
    }

    public void setMediaDetails(MediaDetails mediaDetails) {
        this.mediaDetails = mediaDetails;
    }

    public MediaResponse withMediaDetails(MediaDetails mediaDetails) {
        this.mediaDetails = mediaDetails;
        return this;
    }

    public Object getPost() {
        return post;
    }

    public void setPost(Object post) {
        this.post = post;
    }

    public MediaResponse withPost(Object post) {
        this.post = post;
        return this;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public MediaResponse withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public MediaResponse withLinks(Links links) {
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
        dest.writeValue(author);
        dest.writeValue(commentStatus);
        dest.writeValue(pingStatus);
        dest.writeValue(template);
        dest.writeList(meta);
        dest.writeValue(description);
        dest.writeValue(caption);
        dest.writeValue(altText);
        dest.writeValue(mediaType);
        dest.writeValue(mimeType);
        dest.writeValue(mediaDetails);
        dest.writeValue(post);
        dest.writeValue(sourceUrl);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
