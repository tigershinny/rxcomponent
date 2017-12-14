package com.tiger.persistence.douban;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.tiger.persistence.Converters;

/**
 * Created by tigershen on 2017/12/14.
 */

@Database(entities = {MovieSubject.class, CastsBean.class, DirectorsBean.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class DoubanDB extends RoomDatabase {

    private static volatile DoubanDB INSTANCE;

    public abstract DoubanDao doubanDao();

    public static DoubanDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (DoubanDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DoubanDB.class, "douban.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
