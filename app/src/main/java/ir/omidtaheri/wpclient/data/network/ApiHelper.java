
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


public interface ApiHelper {



    Observable<List<PostsResponse>> GetPostList(String tags);

    Observable<List<PostsResponse>> GetPostList(int page);

    Call<List<PostsResponse>> GetPostListByHeader(int page);


    Observable<List<PostsResponse>> GetPostList();

    Observable<List<PostsResponse>> GetPostRevisionsList();


    Observable<List<CategoriesResponse>> GetCategoriesList();


    Observable<List<TagsResponse>> GetTagsList();


    Observable<List<PagesResponse>> GetPagesList();


    Observable<List<PostsResponse>> GetCommentList();


    Observable<TaxonomiesResponse> GetTaxonomiesList();


    Observable<List<MediaResponse>> GetMediaList();


    Observable<List<UsersResponse>> GetUsersList();


    Observable<PostTypesResponse> GetPostTypesList();


    Observable<PostStatusesResponse> GetPostStatusesList();

    Observable<PostsResponse> GetSettingList();


    ////////////////
    Observable<List<PostsResponse>> GetPostList(int per_page,
                                                String search,
                                                String author,
                                                String order,
                                                String tags,
                                                String categories);


    Observable<List<PostsResponse>> GetPostList(Map<String, Object> options);


    Call<List<PostsResponse>> GetPostListByHeader(Map<String, Object> options);


    Observable<PostsResponse> GetPost(int post_id);


    Observable<List<PagesResponse>> GetPagesList(int per_page,
                                                 String search,
                                                 String author,
                                                 String order);


    Observable<List<PagesResponse>> GetPagesList(Map<String, Object> options);


    Observable<PagesResponse> GetPage(int page_id);


    Observable<List<CategoriesResponse>> GetCategoriesList(int per_page,
                                                           String search,
                                                           boolean hide_empty,
                                                           String order);


    Observable<List<CategoriesResponse>> GetCategoriesList(Map<String, Object> options);


    Observable<CategoriesResponse> GetCategory(int category_id);

    Observable<List<TagsResponse>> GetTagsList(int per_page,
                                               String search,
                                               boolean hide_empty,
                                               String order);


    Observable<List<TagsResponse>> GetTagsList(Map<String, Object> options);


    Observable<TagsResponse> GetTag(int tag_id);


    Observable<TaxonomiesResponse> GetTaxonomiesList(String type);


    Observable<TaxonomiesResponse> GetTaxonomy(int taxonomy_id);


    Observable<List<MediaResponse>> GetMediaList(int per_page,
                                                 String search,
                                                 String author,
                                                 String order,
                                                 String media_type);


    Observable<List<MediaResponse>> GetMediaList(Map<String, Object> options);


    Observable<MediaResponse> GetMedia(int media_id);


    Observable<List<UsersResponse>> GetUsersList(int per_page,
                                                 String search,
                                                 String roles,
                                                 String order);

    Observable<List<UsersResponse>> GetUsersList(Map<String, Object> options);

    Observable<UsersResponse> GetUser(int user_id);

    Observable<PostTypesResponse> GetPostType(String post_type);

    Observable<PostStatusesResponse> GetPostStatusesList(String post_status);


}
