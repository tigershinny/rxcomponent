package com.tiger.persistence.movie;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by tigershen on 2017/12/14.
 */
@Entity
public class MovieRelativeInfo {
    /**
     * showType : horizontal
     * childList : [{"airTime":2017,"duration":"00:01:12","loadtype":"video","score":0,"angleIcon":"","dataId":"CMCC_00000000000000001_623256747","description":"《那年夏天你去了哪里》心劫预告 胡歌饰演\u201c史上最坏角色\u201d","loadURL":"https://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_623256747","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2016/12/26/1482744417596025324.jpg","title":"《那年夏天你去了哪里》心劫预"},{"airTime":2016,"duration":"00:46:53","loadtype":"video","score":0,"angleIcon":"","dataId":"882150d2928f534faabc6a00bf653e9ecc","description":"10月11日，悬疑电影《那年夏天你去了哪里》在北京举办发布会，当天，监制邓汉强、导演周隼、主演宋佳、林家栋、颜卓灵、胡歌等都到了现场。场上，片方公布了首款预告片，并宣布定档12月2日。出品人江志强表示，对电影非常的有信心，也希望可以在贺岁档中有一个比较好的票房。","loadURL":"https://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=882150d2928f534faabc6a00bf653e9ecc","shareURL":"","pic":"http://y1.cnliveimg.com:8080/image/itv/2016/1011/2150d2928f534faabc6a00bf653e9ecc_100.jpg","title":"《那年夏天你去了哪里》发布会回放"},{"airTime":0,"duration":"00:00:39","loadtype":"video","score":0,"angleIcon":"","dataId":"CMCC_00000000000000001_622218439","description":"《那年夏天你去了哪里》宋佳颜卓灵\u201c姐妹\u201d貌合神离","loadURL":"https://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=CMCC_00000000000000001_622218439","shareURL":"","pic":"http://yweb1.cnliveimg.com/img/CMCC_MOVIE/622218439_336_220.jpg","title":"《那年夏天你去了哪里》宋佳颜卓灵\u201c姐妹\u201d貌合神离"}]
     * title : 相关视频
     */
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private int movie_id;
    @ColumnInfo
    private String showType;
    @ColumnInfo
    private String title;

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
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

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }
}
