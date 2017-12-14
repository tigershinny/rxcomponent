package com.tiger.persistence.neteasy;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.tiger.persistence.github.UserInfo;

/**
 * Created by tigershen on 2017/12/14.
 */

@Database(entities = {UserInfo.class}, version = 1)
public abstract class NeteasyNewsDB extends RoomDatabase {

    private static volatile NeteasyNewsDB INSTANCE;

    public abstract NeteasyNewsDao newsDao();

    public static NeteasyNewsDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (NeteasyNewsDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            NeteasyNewsDB.class, "github.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
