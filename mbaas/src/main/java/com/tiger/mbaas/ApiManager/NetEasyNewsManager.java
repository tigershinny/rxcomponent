package com.tiger.mbaas.ApiManager;

import com.tiger.mbaas.Config;
import com.tiger.mbaas.api.MovieApi;
import com.tiger.mbaas.api.NetEasyNewsApi;
import com.tiger.mbaas.entity.response.movie.RetDataBean;
import com.tiger.mbaas.entity.response.neteasy.HealthNewsList;
import com.tiger.mbaas.entity.response.neteasy.MilitaryNewsList;
import com.tiger.mbaas.entity.response.neteasy.RelaxNewsList;
import com.tiger.mbaas.entity.response.neteasy.SportNewsList;
import com.tiger.mbaas.entity.response.neteasy.TecNewsList;
import com.tiger.mbaas.entity.response.neteasy.TopNewsList;
import com.tiger.mbaas.entity.response.neteasy.TravelNewsList;
import com.tiger.mbaas.mapper.MovieResponseMapper;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by tigershen on 2017/12/13.
 */

public class NetEasyNewsManager extends ApiManager<NetEasyNewsApi>{

    private NetEasyNewsApi netEasyNewsApi;

    private static NetEasyNewsManager netEasyNewsManager;
    private NetEasyNewsManager() {
        super(Config.NETEASY_NEWS_API);
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
    public Observable<TopNewsList> getTopNews(String index){
        return getService().getTopNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<TecNewsList> getTecNews(String index){
        return getService().getTecNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<SportNewsList> getSportNews(String index){
        return getService().getSportNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<HealthNewsList> getRecommendNews(String index){
        return getService().getRecommendNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<RelaxNewsList> getDadaNews(String index){
        return getService().getDadaNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<MilitaryNewsList> getMilitaryNews(String index){
        return getService().getMilitaryNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<TravelNewsList> getTravelNews(String index){
        return getService().getTravelNews(index)
                .subscribeOn(Schedulers.io());
    }

    public Observable<ResponseBody> getNewsContent(String index){
        return getService().getNewsContent(index)
                .subscribeOn(Schedulers.io());
    }
}
