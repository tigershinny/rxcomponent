package com.tiger.persistence.movie;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

/**
 * Created by tigershen on 2017/12/14.
 */

public class MovieRelativeEntity {
    @Embedded
    public MovieRelativeInfo movieRelativeInfo;

    @Relation(parentColumn = "id", entityColumn = "relative_id", entity = MovieRelativeBean.class)
    public List<MovieRelativeBean> movieRelativeInfos;
}
