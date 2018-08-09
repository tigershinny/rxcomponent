package com.tiger.repository.persistence.neteasy;

/**
 * Created by tigershen on 2017/12/14.
 */

import java.util.List;

import io.reactivex.Flowable;

/**
 * Access point for managing user data.
 */
public interface INeteasyNewsDS {

    Flowable<List<NewsEntity>> getNews();

    void insertOrUpdateUser(NewsEntity news);

    void deleteAllNews();
}
