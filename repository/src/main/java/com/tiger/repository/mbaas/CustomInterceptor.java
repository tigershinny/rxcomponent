package com.tiger.repository.mbaas;

import com.tiger.repository.mbaas.ApiManager.DouBanManager;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by tigershen on 2017/12/13.
 */

public class CustomInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .header("User-agent", "Mozilla/4.0")
                .build();
        return chain.proceed(request);
    }
}