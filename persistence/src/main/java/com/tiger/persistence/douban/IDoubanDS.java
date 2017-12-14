package com.tiger.persistence.douban;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/14.
 */

public interface IDoubanDS {

    Flowable<List<MovieEntity>> geMovies();

    void insertOrUpdateMovie(MovieEntity movie);

    void deleteAllMovies();
}
