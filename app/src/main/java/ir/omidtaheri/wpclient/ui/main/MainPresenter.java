/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package ir.omidtaheri.wpclient.ui.main;


import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.BasePresenter;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;
import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class MainPresenter<V extends MainMvpView> extends BasePresenter<V>
        implements MainMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public MainPresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }


    @Override
    public void onToolbarSearchClick() {
        getMvpView().showSearchActivity();
    }


    @Override
    public void onDrawerCategoriesClick() {
        getMvpView().closeNavigationDrawer();
        getMvpView().showCategoriesActivity();
    }


    @Override
    public void loadFirstPage(int page) {


        getDataManager().GetPostListByHeader(page).enqueue(new Callback<List<PostsResponse>>() {
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
                    getMvpView().setupList(result);

                } else {

                    getMvpView().errore_load_first_page(R.string.some_error);


                }


            }

            @Override
            public void onFailure(Call<List<PostsResponse>> call, Throwable t) {
                if (!isViewAttached()) {
                    return;
                }

                getMvpView().errore_load_first_page(handleApiError(t) );
            }
        });
    }

    @Override
    public void loadNextPage(final int page) {
        getCompositeDisposable().add(getDataManager().GetPostList(page)
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

                        getMvpView().errore_load_next_page(  page, handleApiError(throwable));
                    }
                }));
    }

}
