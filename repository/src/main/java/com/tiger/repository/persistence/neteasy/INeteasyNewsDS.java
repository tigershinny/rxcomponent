package com.tiger.repository.persistence.neteasy;

/**
 * Created by tigershen on 2017/12/14.
 */

import io.reactivex.Flowable;

/**
 * Access point for managing user data.
 */
public interface INeteasyNewsDS {

    Flowable<NewsEntity> getNews();

    void insertOrUpdateUser(NewsEntity news);

    void deleteAllNews();
}
