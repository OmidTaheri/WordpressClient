package ir.omidtaheri.wpclient.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;

import ir.omidtaheri.wpclient.data.network.model.Categories.CategoriesResponse;
import ir.omidtaheri.wpclient.data.network.model.Media.MediaResponse;
import ir.omidtaheri.wpclient.data.network.model.Pages.PagesResponse;
import ir.omidtaheri.wpclient.data.network.model.Post_Statuses.PostStatusesResponse;
import ir.omidtaheri.wpclient.data.network.model.Post_Types.PostTypesResponse;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.data.network.model.Tags.TagsResponse;
import ir.omidtaheri.wpclient.data.network.model.Taxonomies.TaxonomiesResponse;
import ir.omidtaheri.wpclient.data.network.model.Users.UsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;


public interface ApiInterface {

    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Observable<List<PostsResponse>> GetPostList(@Query("tags") String tags);

    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Observable<List<PostsResponse>> GetPostList(@Query("page") int page);

    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Call<List<PostsResponse>> GetPostListByHeader(@Query("page") int page);


    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Observable<List<PostsResponse>> GetPostList();


    @GET(ApiEndPoint.ENDPOINT_POST_REVISIONS)
    Observable<List<PostsResponse>> GetPostRevisionsList();


    @GET(ApiEndPoint.ENDPOINT_CATEGORIES)
    Observable<List<CategoriesResponse>> GetCategoriesList();


    @GET(ApiEndPoint.ENDPOINT_TAGS)
    Observable<List<TagsResponse>> GetTagsList();/////////////


    @GET(ApiEndPoint.ENDPOINT_PAGES)
    Observable<List<PagesResponse>> GetPagesList();

    @GET(ApiEndPoint.ENDPOINT_COMMENTS)
    Observable<List<PostsResponse>> GetCommentList();

    @GET(ApiEndPoint.ENDPOINT_TAXONOMIES)
    Observable<TaxonomiesResponse> GetTaxonomiesList();

    @GET(ApiEndPoint.ENDPOINT_MEDIA)
    Observable<List<MediaResponse>> GetMediaList();

    @GET(ApiEndPoint.ENDPOINT_USERS)
    Observable<List<UsersResponse>> GetUsersList();


    @GET(ApiEndPoint.ENDPOINT_POST_TYPES)
    Observable<PostTypesResponse> GetPostTypesList();


    @GET(ApiEndPoint.ENDPOINT_POST_STATUSES)
    Observable<PostStatusesResponse> GetPostStatusesList();

    @GET(ApiEndPoint.ENDPOINT_SETTINGS)
    Observable<PostsResponse> GetSettingList();

////////////////////////////////////////////////////////////

    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Observable<List<PostsResponse>> GetPostList(@Query("per_page") int per_page,
                                                @Query("search") String search,
                                                @Query("author") String author,
                                                @Query("order") String order,
                                                @Query("tags") String tags,
                                                @Query("categories") String categories);


    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Observable<List<PostsResponse>> GetPostList(@QueryMap Map<String, Object> options);

    @GET(ApiEndPoint.ENDPOINT_POSTS)
    Call<List<PostsResponse>> GetPostListByHeader(@QueryMap Map<String, Object> options);


    @GET(ApiEndPoint.ENDPOINT_POSTS + "/{id}")
    Observable<PostsResponse> GetPost(@Path("id") int post_id);


    ////////////

    @GET(ApiEndPoint.ENDPOINT_PAGES)
    Observable<List<PagesResponse>> GetPagesList(@Query("per_page") int per_page,
                                                 @Query("search") String search,
                                                 @Query("author") String author,
                                                 @Query("order") String order);


    @GET(ApiEndPoint.ENDPOINT_PAGES)
    Observable<List<PagesResponse>> GetPagesList(@QueryMap Map<String, Object> options);

    @GET(ApiEndPoint.ENDPOINT_PAGES + "/{id}")
    Observable<PagesResponse> GetPage(@Path("id") int page_id);

    ///////////////////
    @GET(ApiEndPoint.ENDPOINT_CATEGORIES)
    Observable<List<CategoriesResponse>> GetCategoriesList(@Query("per_page") int per_page,
                                                           @Query("search") String search,
                                                           @Query("hide_empty") boolean hide_empty,
                                                           @Query("order") String order);


    @GET(ApiEndPoint.ENDPOINT_CATEGORIES)
    Observable<List<CategoriesResponse>> GetCategoriesList(@QueryMap Map<String, Object> options);

    @GET(ApiEndPoint.ENDPOINT_CATEGORIES + "/{id}")
    Observable<CategoriesResponse> GetCategory(@Path("id") int category_id);
    ///////////////////////////////

    @GET(ApiEndPoint.ENDPOINT_TAGS)
    Observable<List<TagsResponse>> GetTagsList(@Query("per_page") int per_page,
                                               @Query("search") String search,
                                               @Query("hide_empty") boolean hide_empty,
                                               @Query("order") String order);


    @GET(ApiEndPoint.ENDPOINT_TAGS)
    Observable<List<TagsResponse>> GetTagsList(@QueryMap Map<String, Object> options);

    @GET(ApiEndPoint.ENDPOINT_TAGS + "/{id}")
    Observable<TagsResponse> GetTag(@Path("id") int tag_id);


    /////////////////////////////////////////

    @GET(ApiEndPoint.ENDPOINT_TAXONOMIES)
    Observable<TaxonomiesResponse> GetTaxonomiesList(@Query("type") String type);


//    @GET(ApiEndPoint.ENDPOINT_TAXONOMIES)
//    Observable<TaxonomiesResponse> GetTaxonomiesList(@QueryMap Map<String, String> options);


    @GET(ApiEndPoint.ENDPOINT_TAXONOMIES + "/{id}")
    Observable<TaxonomiesResponse> GetTaxonomy(@Path("id") int taxonomy_id);


    ///////////////////////////////
    @GET(ApiEndPoint.ENDPOINT_MEDIA)
    Observable<List<MediaResponse>> GetMediaList(@Query("per_page") int per_page,
                                                 @Query("search") String search,
                                                 @Query("author") String author,
                                                 @Query("order") String order,
                                                 @Query("media_type") String media_type);

    @GET(ApiEndPoint.ENDPOINT_MEDIA)
    Observable<List<MediaResponse>> GetMediaList(@QueryMap Map<String, Object> options);


    @GET(ApiEndPoint.ENDPOINT_MEDIA + "/{id}")
    Observable<MediaResponse> GetMedia(@Path("id") int media_id);


    ////////////////////
    @GET(ApiEndPoint.ENDPOINT_USERS)
    Observable<List<UsersResponse>> GetUsersList(@Query("per_page") int per_page,
                                                 @Query("search") String search,
                                                 @Query("roles") String roles,
                                                 @Query("order") String order);


    @GET(ApiEndPoint.ENDPOINT_USERS)
    Observable<List<UsersResponse>> GetUsersList(@QueryMap Map<String, Object> options);


    @GET(ApiEndPoint.ENDPOINT_USERS + "/{id}")
    Observable<UsersResponse> GetUser(@Path("id") int user_id);

    //////////////
    @GET(ApiEndPoint.ENDPOINT_POST_TYPES + "/{type}")
    Observable<PostTypesResponse> GetPostType(@Path("type") String post_type);

    //////////////

    @GET(ApiEndPoint.ENDPOINT_POST_STATUSES + "/{status}")
    Observable<PostStatusesResponse> GetPostStatusesList(@Path("status") String post_status);


}
