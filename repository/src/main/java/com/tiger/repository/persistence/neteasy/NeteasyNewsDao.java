package com.tiger.repository.persistence.neteasy;

/**
 * Created by tigershen on 2017/12/14.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Data Access Object for the users table.
 */
@Dao
public interface NeteasyNewsDao {


    @Query("SELECT * FROM NewsEntity")
    Flowable<List<NewsEntity>> getNews();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNews(NewsEntity... news);

    @Query("DELETE FROM NewsEntity")
    void deleteAllNews();
}
