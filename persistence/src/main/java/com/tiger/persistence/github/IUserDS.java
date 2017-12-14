package com.tiger.persistence.github;

/**
 * Created by tigershen on 2017/12/14.
 */

import io.reactivex.Flowable;

/**
 * Access point for managing user data.
 */
public interface IUserDS {

    /**
     * Gets the user from the data source.
     *
     * @return the user from the data source.
     */
    Flowable<UserInfo> getUser();

    /**
     * Inserts the user into the data source, or, if this is an existing user, updates it.
     *
     * @param user the user to be inserted or updated.
     */
    void insertOrUpdateUser(UserInfo user);

    /**
     * Deletes all users from the data source.
     */
    void deleteAllUsers();
}
