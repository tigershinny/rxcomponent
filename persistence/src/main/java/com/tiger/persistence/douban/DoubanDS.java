package com.tiger.persistence.douban;


import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/14.
 */

public class DoubanDS implements IDoubanDS{

    private final DoubanDao doubanDao;

    public DoubanDS(DoubanDao doubanDao){
        this.doubanDao = doubanDao;
    }

    @Override
    public Flowable<List<MovieEntity>> geMovies() {
        return doubanDao.getMovies();
    }

    @Override
    public void insertOrUpdateMovie(MovieEntity movie) {
        doubanDao.insert(movie);
    }

    @Override
    public void deleteAllMovies() {
        doubanDao.deleteAllMovies();
    }
}
