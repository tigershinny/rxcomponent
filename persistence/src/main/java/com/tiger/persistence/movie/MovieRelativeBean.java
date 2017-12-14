package com.tiger.persistence.movie;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by tigershen on 2017/12/14.
 */
@Entity
public class MovieRelativeBean {
    /**
     * airTime : 2017
     * duration : 00:01:12
     * loadtype : video
     * score : 0
     * angleIcon :
     * dataId : CMCC_00000000000000001_623256747
     * description : 《那年夏天你去了哪里》心劫预告 胡歌饰演“史上最坏角色”
     * loadURL : https://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_623256747
     * shareURL :
     * pic : http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/26/1482744417596025324.jpg
     * title : 《那年夏天你去了哪里》心劫预
     */
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private int relative_id;
    @ColumnInfo
    private int airTime;
    @ColumnInfo
    private String duration;
    @ColumnInfo
    private String loadtype;
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

    public int getAirTime() {
        return airTime;
    }

    public void setAirTime(int airTime) {
        this.airTime = airTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLoadtype() {
        return loadtype;
    }

    public void setLoadtype(String loadtype) {
        this.loadtype = loadtype;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(float score) {
        this.score = score;
    }


    public int getRelative_id() {
        return relative_id;
    }

    public void setRelative_id(int relative_id) {
        this.relative_id = relative_id;
    }
}
