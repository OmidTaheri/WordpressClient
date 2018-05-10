

package ir.omidtaheri.wpclient.data;


import android.content.Context;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ir.omidtaheri.wpclient.data.network.ApiHelper;
import ir.omidtaheri.wpclient.data.network.model.Categories.CategoriesResponse;
import ir.omidtaheri.wpclient.data.network.model.Media.MediaResponse;
import ir.omidtaheri.wpclient.data.network.model.Pages.PagesResponse;
import ir.omidtaheri.wpclient.data.network.model.Post_Statuses.PostStatusesResponse;
import ir.omidtaheri.wpclient.data.network.model.Post_Types.PostTypesResponse;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.data.network.model.Tags.TagsResponse;
import ir.omidtaheri.wpclient.data.network.model.Taxonomies.TaxonomiesResponse;
import ir.omidtaheri.wpclient.data.network.model.Users.UsersResponse;
import ir.omidtaheri.wpclient.di.ApplicationContext;
import retrofit2.Call;

import javax.inject.Inject;
import javax.inject.Singleton;



@Singleton
public class AppDataManager implements DataManager {


    private final Context mContext;
    private final ApiHelper mApiHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          ApiHelper apiHelper) {
        mContext = context;
        mApiHelper = apiHelper;
    }


    @Override
    public Observable<List<PostsResponse>> GetPostList(String tags) {
        return mApiHelper.GetPostList(tags);
    }

    @Override
    public Observable<List<PostsResponse>> GetPostList(int page) {
        return mApiHelper.GetPostList(page);
    }

    @Override
    public Call<List<PostsResponse>> GetPostListByHeader(int page) {
        return mApiHelper.GetPostListByHeader(page);
    }

    @Override
    public Observable<List<PostsResponse>> GetPostList() {
        return mApiHelper.GetPostList();
    }

    @Override
    public Observable<List<PostsResponse>> GetPostRevisionsList() {
        return mApiHelper.GetPostRevisionsList();
    }

    @Override
    public Observable<List<CategoriesResponse>> GetCategoriesList() {
        return mApiHelper.GetCategoriesList();
    }

    @Override
    public Observable<List<TagsResponse>> GetTagsList() {
        return mApiHelper.GetTagsList();
    }

    @Override
    public Observable<List<PagesResponse>> GetPagesList() {
        return mApiHelper.GetPagesList();
    }

    @Override
    public Observable<List<PostsResponse>> GetCommentList() {
        return mApiHelper.GetCommentList();
    }

    @Override
    public Observable<TaxonomiesResponse> GetTaxonomiesList() {
        return mApiHelper.GetTaxonomiesList();
    }


    @Override
    public Observable<List<MediaResponse>> GetMediaList() {
        return mApiHelper.GetMediaList();
    }

    @Override
    public Observable<List<UsersResponse>> GetUsersList() {
        return mApiHelper.GetUsersList();
    }

    @Override
    public Observable<PostTypesResponse> GetPostTypesList() {
        return mApiHelper.GetPostTypesList();
    }

    @Override
    public Observable<PostStatusesResponse> GetPostStatusesList() {
        return mApiHelper.GetPostStatusesList();
    }

    @Override
    public Observable<PostsResponse> GetSettingList() {
        return mApiHelper.GetSettingList();
    }


    ////////////////////////////////////////////////////
    @Override
    public Observable<List<PostsResponse>> GetPostList(int per_page, String search, String author, String order, String tags, String categories) {
        return mApiHelper.GetPostList(per_page, search, author, order, tags, categories);
    }

    @Override
    public Observable<List<PostsResponse>> GetPostList(Map<String, Object> options) {
        return mApiHelper.GetPostList(options);
    }

    @Override
    public Call<List<PostsResponse>> GetPostListByHeader(Map<String, Object> options) {
        return mApiHelper.GetPostListByHeader(options);
    }

    @Override
    public Observable<PostsResponse> GetPost(int post_id) {
        return mApiHelper.GetPost(post_id);
    }

    @Override
    public Observable<List<PagesResponse>> GetPagesList(int per_page, String search, String author, String order) {
        return mApiHelper.GetPagesList(per_page, search, author, order);
    }

    @Override
    public Observable<List<PagesResponse>> GetPagesList(Map<String, Object> options) {
        return mApiHelper.GetPagesList(options);
    }

    @Override
    public Observable<PagesResponse> GetPage(int page_id) {
        return mApiHelper.GetPage(page_id);
    }

    @Override
    public Observable<List<CategoriesResponse>> GetCategoriesList(int per_page, String search, boolean hide_empty, String order) {
        return mApiHelper.GetCategoriesList(per_page, search, hide_empty, order);
    }

    @Override
    public Observable<List<CategoriesResponse>> GetCategoriesList(Map<String, Object> options) {
        return mApiHelper.GetCategoriesList(options);
    }

    @Override
    public Observable<CategoriesResponse> GetCategory(int category_id) {
        return mApiHelper.GetCategory(category_id);
    }

    @Override
    public Observable<List<TagsResponse>> GetTagsList(int per_page, String search, boolean hide_empty, String order) {
        return mApiHelper.GetTagsList(per_page, search, hide_empty, order);
    }

    @Override
    public Observable<List<TagsResponse>> GetTagsList(Map<String, Object> options) {
        return mApiHelper.GetTagsList(options);
    }

    @Override
    public Observable<TagsResponse> GetTag(int tag_id) {
        return mApiHelper.GetTag(tag_id);
    }

    @Override
    public Observable<TaxonomiesResponse> GetTaxonomiesList(String type) {
        return mApiHelper.GetTaxonomiesList(type);
    }

    @Override
    public Observable<TaxonomiesResponse> GetTaxonomy(int taxonomy_id) {
        return mApiHelper.GetTaxonomy(taxonomy_id);
    }

    @Override
    public Observable<List<MediaResponse>> GetMediaList(int per_page, String search, String author, String order, String media_type) {
        return mApiHelper.GetMediaList(per_page, search, author, order, media_type);
    }

    @Override
    public Observable<List<MediaResponse>> GetMediaList(Map<String, Object> options) {
        return mApiHelper.GetMediaList(options);
    }

    @Override
    public Observable<MediaResponse> GetMedia(int media_id) {
        return mApiHelper.GetMedia(media_id);
    }

    @Override
    public Observable<List<UsersResponse>> GetUsersList(int per_page, String search, String roles, String order) {
        return mApiHelper.GetUsersList(per_page, search, roles, order);
    }

    @Override
    public Observable<List<UsersResponse>> GetUsersList(Map<String, Object> options) {
        return mApiHelper.GetUsersList(options);
    }

    @Override
    public Observable<UsersResponse> GetUser(int user_id) {
        return mApiHelper.GetUser(user_id);
    }

    @Override
    public Observable<PostTypesResponse> GetPostType(String post_type) {
        return mApiHelper.GetPostType(post_type);
    }

    @Override
    public Observable<PostStatusesResponse> GetPostStatusesList(String post_status) {
        return mApiHelper.GetPostStatusesList(post_status);
    }




}
