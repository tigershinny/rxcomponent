package com.tiger.persistence.movie;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

/**
 * Created by tigershen on 2017/12/14.
 */

public class TypedVideoEntity {
    @Embedded
    TypedVideoInfo videoListInfo;

    @Relation(parentColumn = "id", entityColumn = "video_list_id", entity = VideoEntity.class)
    public List<VideoEntity> videoEntities;
}
