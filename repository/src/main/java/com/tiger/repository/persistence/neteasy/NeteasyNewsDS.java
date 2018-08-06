package com.tiger.repository.persistence.neteasy;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/14.
 */

public class NeteasyNewsDS implements INeteasyNewsDS {

    private final NeteasyNewsDao mNeteasyNewsDao;

    public NeteasyNewsDS(NeteasyNewsDao neteasyNewsDao) {
        mNeteasyNewsDao = neteasyNewsDao;
    }

    @Override
    public Flowable<NewsEntity> getNews() {
        return mNeteasyNewsDao.getNews();
    }

    @Override
    public void insertOrUpdateUser(NewsEntity news) {
        mNeteasyNewsDao.insertNews(news);
    }

    @Override
    public void deleteAllNews() {
        mNeteasyNewsDao.deleteAllNews();
    }
}
