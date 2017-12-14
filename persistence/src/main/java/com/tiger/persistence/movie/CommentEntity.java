package com.tiger.persistence.movie;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

/**
 * Created by tigershen on 2017/12/14.
 */

public class CommentEntity {
    @Embedded
    CommentsInfo commentsInfo;
    @Relation(parentColumn = "id", entityColumn = "movie_id", entity = CommentBean.class)
    public List<CommentBean> commentBeans;
}
