package com.tiger.repository;

import android.content.Context;

import com.tiger.repository.dto.News;
import com.tiger.repository.mbaas.ApiManager.NetEasyNewsManager;
import com.tiger.repository.mbaas.response.neteasy.TopNewsList;
import com.tiger.repository.persistence.neteasy.NeteasyNewsDB;
import com.tiger.repository.persistence.neteasy.NeteasyNewsDao;
import com.tiger.repository.persistence.neteasy.NewsEntity;

import io.reactivex.Flowable;

public class DataSource implements IDataSource {

    private Context context;

    private NetEasyNewsManager netEasyNewsManager;
    private NeteasyNewsDao neteasyNewsDao;

    public DataSource(Context context){
        this.context = context.getApplicationContext();

        netEasyNewsManager = NetEasyNewsManager.getInstence();
        neteasyNewsDao = NeteasyNewsDB.getInstance(context).newsDao();
    }

    @Override
    public Flowable<News> getNews() {
        return netEasyNewsManager.getTopNews("1")
                .flatMapIterable(TopNewsList::getTopNewsArrayList)
                .map(item -> new NewsEntity().cloneFrom(item))
                .doOnNext(newsEntity -> neteasyNewsDao.insertNews(newsEntity))
                .flatMap(entity -> neteasyNewsDao.getNews()
                                .map(newsEntity -> new News().cloneFrom(newsEntity)));

    }
}
