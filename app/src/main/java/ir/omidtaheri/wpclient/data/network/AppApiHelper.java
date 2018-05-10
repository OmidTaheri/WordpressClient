

package ir.omidtaheri.wpclient.data.network;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

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

@Singleton
public class AppApiHelper implements ApiHelper {


    private ApiInterface mApiInterface;

    @Inject
    public AppApiHelper( ApiInterface apiInterface) {
        mApiInterface = apiInterface;
    }

    public ApiInterface getApiInterface() {
        return mApiInterface;
    }




    @Override
    public Observable<List<PostsResponse>> GetPostList(String tags) {
        return getApiInterface().GetPostList(tags);
    }

    @Override
    public Observable<List<PostsResponse>> GetPostList(int page) {
        return getApiInterface().GetPostList(page);
    }

    @Override
    public Call<List<PostsResponse>> GetPostListByHeader(int page) {
        return getApiInterface().GetPostListByHeader(page);
    }

    @Override
    public Observable<List<PostsResponse>> GetPostList() {
        return getApiInterface().GetPostList();
    }

    @Override
    public Observable<List<PostsResponse>> GetPostRevisionsList() {
        return getApiInterface().GetPostRevisionsList();
    }

    @Override
    public Observable<List<CategoriesResponse>> GetCategoriesList() {
        return getApiInterface().GetCategoriesList();
    }

    @Override
    public Observable<List<TagsResponse>> GetTagsList() {
        return getApiInterface().GetTagsList();
    }

    @Override
    public Observable<List<PagesResponse>> GetPagesList() {
        return getApiInterface().GetPagesList();
    }

    @Override
    public Observable<List<PostsResponse>> GetCommentList() {
        return getApiInterface().GetCommentList();
    }

    @Override
    public Observable<TaxonomiesResponse> GetTaxonomiesList() {
        return getApiInterface().GetTaxonomiesList();
    }

    @Override
    public Observable<List<MediaResponse>> GetMediaList() {
        return getApiInterface().GetMediaList();
    }

    @Override
    public Observable<List<UsersResponse>> GetUsersList() {
        return getApiInterface().GetUsersList();
    }

    @Override
    public Observable<PostTypesResponse> GetPostTypesList() {
        return getApiInterface().GetPostTypesList();
    }

    @Override
    public Observable<PostStatusesResponse> GetPostStatusesList() {
        return getApiInterface().GetPostStatusesList();
    }

    @Override
    public Observable<PostsResponse> GetSettingList() {
        return getApiInterface().GetSettingList();
    }


    //////////////////////////////////////////////////////////////////
    @Override
    public Observable<List<PostsResponse>> GetPostList(int per_page, String search, String author, String order, String tags, String categories) {
        return getApiInterface().GetPostList(per_page, search, author, order, tags, categories);
    }

    @Override
    public Observable<List<PostsResponse>> GetPostList(Map<String, Object> options) {
        return getApiInterface().GetPostList(options);
    }

    @Override
    public Call<List<PostsResponse>> GetPostListByHeader(Map<String, Object> options) {
        return getApiInterface().GetPostListByHeader(options);
    }

    @Override
    public Observable<PostsResponse> GetPost(int post_id) {
        return getApiInterface().GetPost(post_id);
    }

    @Override
    public Observable<List<PagesResponse>> GetPagesList(int per_page, String search, String author, String order) {
        return getApiInterface().GetPagesList(per_page, search, author, order);
    }

    @Override
    public Observable<List<PagesResponse>> GetPagesList(Map<String, Object> options) {
        return getApiInterface().GetPagesList(options);
    }

    @Override
    public Observable<PagesResponse> GetPage(int page_id) {
        return getApiInterface().GetPage(page_id);
    }

    @Override
    public Observable<List<CategoriesResponse>> GetCategoriesList(int per_page, String search, boolean hide_empty, String order) {
        return getApiInterface().GetCategoriesList(per_page, search, hide_empty, order);
    }

    @Override
    public Observable<List<CategoriesResponse>> GetCategoriesList(Map<String, Object> options) {
        return getApiInterface().GetCategoriesList(options);
    }

    @Override
    public Observable<CategoriesResponse> GetCategory(int category_id) {
        return getApiInterface().GetCategory(category_id);
    }

    @Override
    public Observable<List<TagsResponse>> GetTagsList(int per_page, String search, boolean hide_empty, String order) {
        return getApiInterface().GetTagsList(per_page, search, hide_empty, order);
    }

    @Override
    public Observable<List<TagsResponse>> GetTagsList(Map<String, Object> options) {
        return getApiInterface().GetTagsList(options);
    }

    @Override
    public Observable<TagsResponse> GetTag(int tag_id) {
        return getApiInterface().GetTag(tag_id);
    }

    @Override
    public Observable<TaxonomiesResponse> GetTaxonomiesList(String type) {
        return getApiInterface().GetTaxonomiesList(type);
    }

    @Override
    public Observable<TaxonomiesResponse> GetTaxonomy(int taxonomy_id) {
        return getApiInterface().GetTaxonomy(taxonomy_id);
    }

    @Override
    public Observable<List<MediaResponse>> GetMediaList(int per_page, String search, String author, String order, String media_type) {
        return getApiInterface().GetMediaList(per_page, search, author, order, media_type);
    }

    @Override
    public Observable<List<MediaResponse>> GetMediaList(Map<String, Object> options) {
        return getApiInterface().GetMediaList(options);
    }

    @Override
    public Observable<MediaResponse> GetMedia(int media_id) {
        return getApiInterface().GetMedia(media_id);
    }

    @Override
    public Observable<List<UsersResponse>> GetUsersList(int per_page, String search, String roles, String order) {
        return getApiInterface().GetUsersList(per_page, search, roles, order);
    }

    @Override
    public Observable<List<UsersResponse>> GetUsersList(Map<String, Object> options) {
        return getApiInterface().GetUsersList(options);
    }

    @Override
    public Observable<UsersResponse> GetUser(int user_id) {
        return getApiInterface().GetUser(user_id);
    }

    @Override
    public Observable<PostTypesResponse> GetPostType(String post_type) {
        return getApiInterface().GetPostType(post_type);
    }

    @Override
    public Observable<PostStatusesResponse> GetPostStatusesList(String post_status) {
        return getApiInterface().GetPostStatusesList(post_status);
    }


}

