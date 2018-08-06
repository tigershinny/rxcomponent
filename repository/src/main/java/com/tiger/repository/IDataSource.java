package com.tiger.repository;

import com.tiger.repository.dto.News;

import io.reactivex.Flowable;

public interface IDataSource {
    Flowable<News> getNews();
}
