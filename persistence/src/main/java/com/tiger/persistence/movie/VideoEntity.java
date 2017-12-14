package com.tiger.persistence.movie;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by tigershen on 2017/12/14.
 */
@Entity
public class VideoEntity {
    /**
     * airTime : 0
     * duration :
     * loadType : html
     * score : 0
     * angleIcon :
     * dataId :
     * description :
     * loadURL : http://h5.svipmovie.com/h5/2017oscars/index_app.html
     * shareURL :
     * pic : http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/02/27/1488155797024092878.jpg
     * title : 不按套路出牌 实力登顶的大咖们
     * roomId :
     */
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private int video_list_id;
    @ColumnInfo
    private String airTime;
    @ColumnInfo
    private String duration;
    @ColumnInfo
    private String loadType;
    @ColumnInfo
    private float score;
    @ColumnInfo
    private String angleIcon;
    @ColumnInfo
    private String dataId;
    @ColumnInfo
    private String description;
    @ColumnInfo
    private String loadURL;
    @ColumnInfo
    private String shareURL;
    @ColumnInfo
    private String pic;
    @ColumnInfo
    private String title;
    @ColumnInfo
    private String roomId;

    public String getAirTime() {
        return airTime;
    }

    public void setAirTime(String airTime) {
        this.airTime = airTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAngleIcon() {
        return angleIcon;
    }

    public void setAngleIcon(String angleIcon) {
        this.angleIcon = angleIcon;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoadURL() {
        return loadURL;
    }

    public void setLoadURL(String loadURL) {
        this.loadURL = loadURL;
    }

    public String getShareURL() {
        return shareURL;
    }

    public void setShareURL(String shareURL) {
        this.shareURL = shareURL;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideo_list_id() {
        return video_list_id;
    }

    public void setVideo_list_id(int video_list_id) {
        this.video_list_id = video_list_id;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
