package com.tiger.repository;

import com.tiger.repository.dto.News;

import java.util.List;

import io.reactivex.Single;

public interface IDataSource {
    Single<List<News>> getNews();
}
