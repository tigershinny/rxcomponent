package com.tiger.persistence.zhihu;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;


/**
 * Created by tigershen on 2017/12/15.
 */
@Database(entities = {ZhiHuDaily.class, ZhihuStoryContent.class, ZhiHuStory.class, ZhiHuTopStory.class}, version = 1)
public abstract class ZhihuDB extends RoomDatabase {

    private static volatile ZhihuDB INSTANCE;

    public abstract ZhihuDao zhihuDao();

    public static ZhihuDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (ZhihuDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ZhihuDB.class, "zhihu.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}