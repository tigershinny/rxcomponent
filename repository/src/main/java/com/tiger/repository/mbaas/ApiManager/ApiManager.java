package com.tiger.repository.mbaas.ApiManager;

import com.tiger.repository.mbaas.Config;
import com.tiger.repository.mbaas.CustomInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tigershen on 2017/12/13.
 */

public abstract class ApiManager<T> {

    protected T api;
    private String apiUrl;

    protected static OkHttpClient mClient;

    protected ApiManager(String apiUrl) {
        mClient = new OkHttpClient.Builder()
                .addInterceptor(new CustomInterceptor())
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        this.apiUrl = apiUrl;
    }

    public T getService() {
        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(mClient)
                    .baseUrl(apiUrl)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create((Class<T>)api.getClass());
        }
        return api;
    }

}
