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

package ir.omidtaheri.wpclient.ui.category;


import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.data.network.model.Categories.CategoriesResponse;
import ir.omidtaheri.wpclient.ui.base.BasePresenter;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;


public class CategoryPresenter<V extends CategoryMvpView> extends BasePresenter<V>
        implements CategoryMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public CategoryPresenter(DataManager dataManager,
                             SchedulerProvider schedulerProvider,
                             CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }




    @Override
    public void getCategoriesList() {
        getMvpView().showLoading();

        getCompositeDisposable().add(getDataManager().GetCategoriesList()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<List<CategoriesResponse>>() {
                    @Override
                    public void accept(List<CategoriesResponse> response) throws Exception {
                        if (!isViewAttached()) {
                            return;
                        }

                        getMvpView().hideLoading();
                        getMvpView().setupList(response);

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (!isViewAttached()) {
                            return;
                        }

                        getMvpView().hideLoading();
                        getMvpView().showMessage("خطا رخ داد");

                    }
                }));
    }

    @Override
    public void showSearchActivity(int id) {
        getMvpView().showSearchActivity(id);
    }


}
