package com.tiger.persistence.github;

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
public interface UserDao {

    /**
     * Get the user from the table. Since for simplicity we only have one user in the database,
     * this query gets all users from the table, but limits the result to just the 1st user.
     *
     * @return the user from the table
     */
    @Query("SELECT * FROM UserInfo LIMIT 1")
    Flowable<UserInfo> getUser();

    /**
     * Insert a user in the database. If the user already exists, replace it.
     *
     * @param user the user to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(UserInfo user);

    /**
     * Delete all users.
     */
    @Query("DELETE FROM UserInfo")
    void deleteAllUsers();
}
