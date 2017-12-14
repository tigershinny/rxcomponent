package com.tiger.persistence.douban;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/14.
 */
@Dao
public interface DoubanDao {
    @Query("SELECT * FROM MovieSubject")
    Flowable<List<MovieEntity>> getMovies();

    @Query("SELECT * FROM MovieSubject WHERE id IN (:id) LIMIT 1")
    MovieEntity loadMovieById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MovieEntity movie);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(MovieEntity... movies);

    @Query("DELETE FROM MovieSubject")
    void deleteAllMovies();

    @Delete
    void delete(MovieEntity movie);
}
