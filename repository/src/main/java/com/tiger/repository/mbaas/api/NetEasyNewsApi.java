package com.tiger.repository.mbaas.api;

import com.tiger.repository.mbaas.Constants;
import com.tiger.repository.mbaas.response.neteasy.HealthNewsList;
import com.tiger.repository.mbaas.response.neteasy.MilitaryNewsList;
import com.tiger.repository.mbaas.response.neteasy.RelaxNewsList;
import com.tiger.repository.mbaas.response.neteasy.SportNewsList;
import com.tiger.repository.mbaas.response.neteasy.TecNewsList;
import com.tiger.repository.mbaas.response.neteasy.TopNewsList;
import com.tiger.repository.mbaas.response.neteasy.TravelNewsList;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by PandaQ on 2016/9/20.
 * email : 767807368@qq.com
 * 网易新闻Api 都默认一次加载20条
 */
public interface NetEasyNewsApi {
    @GET("list/"+ Constants.NETEASY_NEWS_HEADLINE + "/{index}-20.html")
    Flowable<TopNewsList> getTopNews(@Path("index") String index);

    @GET("list/"+Constants.NETEASY_NEWS_TEC + "/{index}-20.html")
    Flowable<TecNewsList> getTecNews(@Path("index") String index);

    @GET("list/"+Constants.NETEASY_NEWS_SPORT + "/{index}-20.html")
    Flowable<SportNewsList> getSportNews(@Path("index") String index);

    @GET("list/"+Constants.NETEASY_NEWS_HEALTH + "/{index}-20.html")
    Flowable<HealthNewsList> getRecommendNews(@Path("index") String index);

    @GET("list/"+Constants.NETEASY_NEWS_DADA + "/{index}-20.html")
    Flowable<RelaxNewsList> getDadaNews(@Path("index") String index);

    @GET("list/"+Constants.NETEASY_NEWS_MILITARY + "/{index}-20.html")
    Flowable<MilitaryNewsList> getMilitaryNews(@Path("index") String index);

    @GET("list/"+Constants.NETEASY_NEWS_TRAVEL + "/{index}-20.html")
    Flowable<TravelNewsList> getTravelNews(@Path("index") String index);

    @GET("{id}/full.html")
    Flowable<ResponseBody> getNewsContent(@Path("id") String id);
}
