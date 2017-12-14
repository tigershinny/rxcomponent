package com.tiger.persistence.neteasy;

/**
 * Created by tigershen on 2017/12/14.
 */

import io.reactivex.Flowable;

/**
 * Access point for managing user data.
 */
public interface INeteasyNewsDS {


    Flowable<NewsBean> getNews();


    void insertOrUpdateUser(NewsBean news);

    void deleteAllNews();
}
