package com.tiger.persistence.douban;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

/**
 * Created by tigershen on 2017/12/14.
 */
@Entity
public class DirectorsBean{
    private String alt;
    /**
     * small : http://img3.douban.com/img/celebrity/small/4360.jpg
     * large : http://img3.douban.com/img/celebrity/large/4360.jpg
     * medium : http://img3.douban.com/img/celebrity/medium/4360.jpg
     */
    @Embedded
    private AvatarsBean avatars;
    @ColumnInfo
    private String name;
    @PrimaryKey
    private String id;
    @ColumnInfo
    private String movie_id;


    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public AvatarsBean getAvatars() {
        return avatars;
    }

    public void setAvatars(AvatarsBean avatars) {
        this.avatars = avatars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class AvatarsBean implements Serializable {
        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }
}
