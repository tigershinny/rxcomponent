package com.tiger.persistence.zhihu;

/**
 * Created by tigershen on 2017/12/14.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Data Access Object for the users table.
 */
@Dao
public interface ZhihuDao {

    @Query("SELECT * FROM ZhiHuDaily LIMIT 1")
    Flowable<ZhiHuDaily> getDaily();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertZhiHuDaily(ZhiHuDaily daily);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStoryContent(ZhihuStoryContent storyContent);

    @Query("DELETE FROM ZhiHuDaily")
    void deleteAllDaily();

    @Query("SELECT * FROM ZhiHuStory WHERE daily_id=:daily_id")
    Flowable<List<ZhiHuStory>> getDailyStroies(final int daily_id);

    @Query("SELECT * FROM ZhiHuTopStory WHERE daily_id=:daily_id")
    Flowable<List<ZhiHuTopStory>> getDailyTopStroies(final int daily_id);

    @Query("SELECT * FROM ZhihuStoryContent WHERE id=:id LIMIT 1")
    Flowable<ZhihuStoryContent> getStoryContent(final int id);

    @Delete
    void delete(ZhiHuDaily... dailies);
}