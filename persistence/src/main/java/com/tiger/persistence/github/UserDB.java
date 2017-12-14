package com.tiger.persistence.github;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by tigershen on 2017/12/14.
 */

@Database(entities = {UserInfo.class}, version = 1)
public abstract class UserDB extends RoomDatabase {

    private static volatile UserDB INSTANCE;

    public abstract UserDao userDao();

    public static UserDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (UserDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UserDB.class, "github.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
