package com.tiger.persistence.douban;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

/**
 * Created by tigershen on 2017/12/14.
 */

public class MovieEntity {
    @Embedded
    public MovieSubject movieSubject;

    @Relation(parentColumn = "id", entityColumn = "movie_id", entity = DirectorsBean.class)
    public List<DirectorsBean> directors;

    @Relation(parentColumn = "id", entityColumn = "movie_id", entity = CastsBean.class)
    public List<CastsBean> casts;
}
