package com.tiger.repository.persistence.neteasy;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.tiger.repository.persistence.Converters;

/**
 * Created by tigershen on 2017/12/14.
 */

@Database(entities = {NewsEntity.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class NeteasyNewsDB extends RoomDatabase {

    private static volatile NeteasyNewsDB INSTANCE;

    public abstract NeteasyNewsDao newsDao();

    public static NeteasyNewsDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (NeteasyNewsDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), NeteasyNewsDB.class, "neteasy.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
