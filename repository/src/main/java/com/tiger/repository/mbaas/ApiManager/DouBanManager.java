package com.tiger.repository.mbaas.ApiManager;

import com.tiger.repository.mbaas.Config;
import com.tiger.repository.mbaas.api.DouBanApi;
import com.tiger.repository.mbaas.response.douban.MovieTop250;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tigershen on 2017/12/13.
 */

public class DouBanManager extends ApiManager<DouBanApi>{

    private static DouBanManager douBanManager;
    private DouBanManager() {
        super(Config.DOUBAN_API_URL);
    }

    public static DouBanManager getInstence() {
        if (douBanManager == null) {
            synchronized (DouBanManager.class) {
                if (douBanManager == null) {
                    douBanManager = new DouBanManager();
                }
            }
        }
        return douBanManager;
    }

    public Observable<MovieTop250> getMovieTop250(int start, int count){
        return getService().getTop250(start, count)
                .subscribeOn(Schedulers.io());
    }


}
