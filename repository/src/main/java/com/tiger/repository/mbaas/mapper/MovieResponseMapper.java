package com.tiger.repository.mbaas.mapper;

import com.tiger.repository.mbaas.response.movie.MovieResponse;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by tigershen on 2017/12/13.
 */

public class MovieResponseMapper<T> implements Function<MovieResponse<T>, Observable<T>> {

    @Override
    public Observable<T> apply(MovieResponse<T> tMovieResponse) throws Exception {
        if (tMovieResponse.getMsg().equalsIgnoreCase("OK") ){
            return Observable.just(tMovieResponse.getData());
        }else{
            return Observable.error(new Throwable(tMovieResponse.getMsg()));
        }
    }
}
