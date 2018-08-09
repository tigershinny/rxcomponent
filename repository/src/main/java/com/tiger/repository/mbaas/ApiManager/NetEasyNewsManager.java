package com.tiger.repository.mbaas.ApiManager;

import com.tiger.repository.mbaas.Config;
import com.tiger.repository.mbaas.api.MovieApi;
import com.tiger.repository.mbaas.api.NetEasyNewsApi;
import com.tiger.repository.mbaas.response.movie.RetDataBean;
import com.tiger.repository.mbaas.response.neteasy.HealthNewsList;
import com.tiger.repository.mbaas.response.neteasy.MilitaryNewsList;
import com.tiger.repository.mbaas.response.neteasy.RelaxNewsList;
import com.tiger.repository.mbaas.response.neteasy.SportNewsList;
import com.tiger.repository.mbaas.response.neteasy.TecNewsList;
import com.tiger.repository.mbaas.response.neteasy.TopNewsList;
import com.tiger.repository.mbaas.response.neteasy.TravelNewsList;
import com.tiger.repository.mbaas.mapper.MovieResponseMapper;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by tigershen on 2017/12/13.
 */

public class NetEasyNewsManager extends ApiManager<NetEasyNewsApi>{


    private static NetEasyNewsManager netEasyNewsManager;
    private NetEasyNewsManager() {
        super(Config.NETEASY_NEWS_API, NetEasyNewsApi.class);
    }

    public static NetEasyNewsManager getInstence() {
        if (netEasyNewsManager == null) {
            synchronized (NetEasyNewsManager.class) {
                if (netEasyNewsManager == null) {
                    netEasyNewsManager = new NetEasyNewsManager();
                }
            }
        }
        return netEasyNewsManager;
    }

    /**
     * 封装 github API
     */
    public Flowable<TopNewsList> getTopNews(String index){
        return getService().getTopNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<TecNewsList> getTecNews(String index){
        return getService().getTecNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<SportNewsList> getSportNews(String index){
        return getService().getSportNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<HealthNewsList> getRecommendNews(String index){
        return getService().getRecommendNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<RelaxNewsList> getDadaNews(String index){
        return getService().getDadaNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<MilitaryNewsList> getMilitaryNews(String index){
        return getService().getMilitaryNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<TravelNewsList> getTravelNews(String index){
        return getService().getTravelNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<ResponseBody> getNewsContent(String index){
        return getService().getNewsContent(index)
                .subscribeOn(Schedulers.io());
    }
}
