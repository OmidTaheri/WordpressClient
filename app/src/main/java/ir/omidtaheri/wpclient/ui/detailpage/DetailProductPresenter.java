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

package ir.omidtaheri.wpclient.ui.detailpage;


import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import ir.omidtaheri.wpclient.data.DataManager;
import ir.omidtaheri.wpclient.data.network.model.Posts.PostsResponse;
import ir.omidtaheri.wpclient.ui.base.BasePresenter;
import ir.omidtaheri.wpclient.utils.rx.SchedulerProvider;


public class DetailProductPresenter<V extends DetailProductMvpView> extends BasePresenter<V>
        implements DetailProductMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public DetailProductPresenter(DataManager dataManager,
                                  SchedulerProvider schedulerProvider,
                                  CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }




    @Override
    public void showPost(PostsResponse item) {
        getMvpView().loadPoastData(item);
    }

}
