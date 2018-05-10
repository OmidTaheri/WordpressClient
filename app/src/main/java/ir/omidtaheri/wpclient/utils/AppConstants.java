

package ir.omidtaheri.wpclient.utils;


public final class AppConstants {


    public static final String TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";




    private AppConstants() {
    }




    public enum orderby_posts {
        author,
        date,
        id,
        include,
        modified,
        parent,
        relevance,
        slug,
        title
    }


    public enum taxonomy_categories {
        category,
        post_tag,
        nav_menu,
        link_category,
        post_format
    }


    public enum taxonomy_tags {
        category,
        post_tag,
        nav_menu,
        link_category,
        post_format
    }


    public enum orderby_tags {
        id,
        include,
        name,
        slug,
        term_group,
        description,
        count
    }

    public enum orderby_categories {
        id,
        include,
        name,
        slug,
        term_group,
        description,
        count
    }


    public enum orderby_pages {
        date,
        relevance,
        id,
        include,
        title,
        slug,
        menu_order
    }


    public enum orderby_comments {
        date,
        date_gmt,
        id,
        include,
        post,
        parent,
        type
    }


    public enum orderby_medias {

        date,
        relevance,
        id,
        include,
        title,
        slug
    }


    public enum status_of_media {
        inherit,
        trash
    }

    public enum media_type {
        image,
        video,
        audio,
        application,
        file
    }


    public enum orderby_users {
        id,
        include,
        name,
        registered_date,
        slug,
        email,
        url
    }
}
