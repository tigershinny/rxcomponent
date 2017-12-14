package com.tiger.persistence.github;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/14.
 */

public class UserDS implements IUserDS {

    private final UserDao mUserDao;

    public UserDS(UserDao userDao) {
        mUserDao = userDao;
    }

    @Override
    public Flowable<UserInfo> getUser() {
        return mUserDao.getUser();
    }

    @Override
    public void insertOrUpdateUser(UserInfo user) {
        mUserDao.insertUser(user);
    }

    @Override
    public void deleteAllUsers() {
        mUserDao.deleteAllUsers();
    }
}
