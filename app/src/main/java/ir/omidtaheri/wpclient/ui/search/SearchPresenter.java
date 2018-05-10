
package ir.omidtaheri.wpclient.ui.search;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.data.network.model.Tags.MultiTags;
import ir.omidtaheri.wpclient.ui.base.BasePresenter;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;
import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class SearchPresenter<V extends SearchMvpView> extends BasePresenter<V>
        implements SearchMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public SearchPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }


    @Override
    public void getCategoriePosts(int category_id) {
        loadFirstPage(1, category_id);
    }

    @Override
    public void loadFirstPage(int page, final int category_id) {

        Map<String, Object> options = new HashMap();

        int[] category_id_array = new int[1];
        category_id_array[0] = category_id;
        options.put("categories", MultiTags.toString(category_id_array));
        options.put("page", page);


        getDataManager().GetPostListByHeader(options).enqueue(new Callback<List<PostsResponse>>() {
            @Override
            public void onResponse(Call<List<PostsResponse>> call, Response<List<PostsResponse>> response) {

                if (!isViewAttached()) {
                    return;
                }

                if (response.headers() != null) {


                    Headers headers = response.headers();

                    if (headers.get("X-WP-TotalPages") != null) {


                        String totalpages = headers.get("X-WP-TotalPages");

                        getMvpView().SetTotalPage(Integer.parseInt(totalpages));

                    }


                }

                if (response.body() != null && response.isSuccessful()) {

                    List<PostsResponse> result = response.body();
                    getMvpView().setupList(result, category_id);

                } else {

                    getMvpView().error_load_first_page_for_category(R.string.some_error,category_id);

                }


            }

            @Override
            public void onFailure(Call<List<PostsResponse>> call, Throwable t) {
                if (!isViewAttached()) {
                    return;
                }

                getMvpView().error_load_first_page_for_category(handleApiError(t),category_id);
            }
        });

    }

    @Override
    public void loadNextPage(final int page, final int category_id) {

        Map<String, Object> options = new HashMap();

        int[] category_id_array = new int[1];
        category_id_array[0] = category_id;
        options.put("categories", MultiTags.toString(category_id_array));
        options.put("page", page);


        getCompositeDisposable().add(getDataManager().GetPostList(options)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<List<PostsResponse>>() {
                    @Override
                    public void accept(List<PostsResponse> response) throws Exception {
                        if (!isViewAttached()) {
                            return;
                        }
                        getMvpView().sucssed_load_next_page(response);

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (!isViewAttached()) {
                            return;
                        }

                        getMvpView().error_load_next_page_for_category(category_id,page,handleApiError(throwable));
                    }
                }));
    }

    @Override
    public void search(String query) {
        loadFirstPageofsearch(1, query);
    }

    @Override
    public void loadFirstPageofsearch(int page, final String query) {

        Map<String, Object> options = new HashMap();

        options.put("search", query);
        options.put("page", page);


        getDataManager().GetPostListByHeader(options).enqueue(new Callback<List<PostsResponse>>() {
            @Override
            public void onResponse(Call<List<PostsResponse>> call, Response<List<PostsResponse>> response) {

                if (!isViewAttached()) {
                    return;
                }

                if (response.headers() != null) {


                    Headers headers = response.headers();

                    if (headers.get("X-WP-TotalPages") != null) {


                        String totalpages = headers.get("X-WP-TotalPages");

                        getMvpView().SetTotalPage(Integer.parseInt(totalpages));

                    }


                }

                if (response.body() != null && response.isSuccessful()) {

                    List<PostsResponse> result = response.body();

                    List<PostsResponse> result2 = new ArrayList<>();

                    for (int i = 0; i < result.size(); i++) {

                        if (result.get(i).getType().toString().equals("post")) {
                            result2.add(result.get(i));
                        }
                    }


                    getMvpView().setupListofSearch(result2, query);

                } else {

                    getMvpView().errore_load_first_page(R.string.some_error,query);
                }


            }

            @Override
            public void onFailure(Call<List<PostsResponse>> call, Throwable t) {
                if (!isViewAttached()) {
                    return;
                }

                getMvpView().errore_load_first_page(handleApiError(t),query);
            }
        });

    }

    @Override
    public void loadNextPageofsearch(final int page, final String query) {

        Map<String, Object> options = new HashMap();

        options.put("search", query);
        options.put("page", page);


        getCompositeDisposable().add(getDataManager().GetPostList(options)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<List<PostsResponse>>() {
                    @Override
                    public void accept(List<PostsResponse> response) throws Exception {
                        if (!isViewAttached()) {
                            return;
                        }

                        List<PostsResponse> result2 = new ArrayList<>();

                        for (int i = 0; i < response.size(); i++) {

                            if (response.get(i).getType().toString().equals("post")) {
                                result2.add(response.get(i));
                            }
                        }
                        getMvpView().sucssed_load_next_page(result2);

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (!isViewAttached()) {
                            return;
                        }

                        getMvpView().errore_load_next_page(query,page,handleApiError(throwable));
                    }
                }));
    }



}
