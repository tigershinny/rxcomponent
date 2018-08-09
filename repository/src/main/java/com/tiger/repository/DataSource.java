package com.tiger.repository;

import android.content.Context;
import android.util.Log;

import com.tiger.repository.dto.News;
import com.tiger.repository.mbaas.ApiManager.NetEasyNewsManager;
import com.tiger.repository.mbaas.response.neteasy.TopNewsList;
import com.tiger.repository.persistence.neteasy.NeteasyNewsDB;
import com.tiger.repository.persistence.neteasy.NeteasyNewsDao;
import com.tiger.repository.persistence.neteasy.NewsEntity;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

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
    public Single<List<News>> getNews() {
        return netEasyNewsManager.getTopNews("0")
                .flatMapIterable(TopNewsList::getTopNewsArrayList)
                .map(item -> new NewsEntity().cloneFrom(item))
                .doOnNext(newsEntity -> neteasyNewsDao.insertNews(newsEntity))
                .map(entity -> new News().cloneFrom(entity))
                .toList();
    }
}
