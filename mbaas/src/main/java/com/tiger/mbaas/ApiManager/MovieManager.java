package com.tiger.mbaas.ApiManager;

import com.tiger.mbaas.Config;
import com.tiger.mbaas.api.MovieApi;
import com.tiger.mbaas.entity.response.movie.CommentBean;
import com.tiger.mbaas.entity.response.movie.MovieInfo;
import com.tiger.mbaas.entity.response.movie.RetDataBean;
import com.tiger.mbaas.entity.response.movie.TypedVideos;
import com.tiger.mbaas.mapper.MovieResponseMapper;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tigershen on 2017/12/13.
 */

public class MovieManager extends ApiManager<MovieApi>{

    private static MovieManager movieManager;
    private MovieManager() {
        super(Config.MOVIE_API_URL);
    }

    public static MovieManager getInstence() {
        if (movieManager == null) {
            synchronized (MovieManager.class) {
                if (movieManager == null) {
                    movieManager = new MovieManager();
                }
            }
        }
        return movieManager;
    }

    public Observable<RetDataBean> getHomePage(String path){
        return getService().getHomePage()
                .flatMap(new MovieResponseMapper<RetDataBean>())
                .subscribeOn(Schedulers.io());
    }

    public Observable<MovieInfo> getMovieDaily(String mediaId){
        return getService().getMovieDaily(mediaId)
                .flatMap(new MovieResponseMapper<MovieInfo>())
                .subscribeOn(Schedulers.io());
    }

    public Observable<CommentBean> getVideoListByKeyWord(String mediaId, String pnum){
        return getService().getCommentList(mediaId, pnum)
                .flatMap(new MovieResponseMapper<CommentBean>())
                .subscribeOn(Schedulers.io());
    }

    public Observable<TypedVideos> getTypedVideos(String catalogId, String pnum){
        return getService().getTypedVideos(catalogId, pnum)
                .flatMap(new MovieResponseMapper<TypedVideos>())
                .subscribeOn(Schedulers.io());
    }

    public Observable<TypedVideos> getLiveVideo(String catalogId, String pnum){
        return getService().getLiveVideo(catalogId, pnum)
                .flatMap(new MovieResponseMapper<TypedVideos>())
                .subscribeOn(Schedulers.io());
    }
}
