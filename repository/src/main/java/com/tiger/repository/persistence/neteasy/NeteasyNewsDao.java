package com.tiger.repository.persistence.neteasy;

/**
 * Created by tigershen on 2017/12/14.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import io.reactivex.Flowable;

/**
 * Data Access Object for the users table.
 */
@Dao
public interface NeteasyNewsDao {


    @Query("SELECT * FROM NewsBean")
    Flowable<NewsBean> getNews();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNews(NewsBean news);

    @Query("DELETE FROM NewsBean")
    void deleteAllNews();
}
