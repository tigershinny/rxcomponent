package com.tiger.persistence.movie;

import android.arch.persistence.room.ColumnInfo;

/**
 * Created by tigershen on 2017/12/13.
 */

public class TypedVideoInfo {

    /**
     * pnum : 1
     * totalRecords : 30
     * records : 30
     * list : [{"airTime":0,"duration":"00:01:48","loadtype":"video","score":0,"angleIcon":"","dataId":"b020deb9331246ad8321d498014229a8","description":"@TV娱乐前线：14日，张智霖等艺人出席了某记者会，张智霖谈生女儿一事称顺其自然。","loadURL":"https://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=b020deb9331246ad8321d498014229a8","shareURL":"https://h5.svipmovie.com/zxgl/b020deb9331246ad8321d498014229a8.shtml?fromTo=shoujimovie","pic":"http://y2.cnliveimg.com:8080/image/itv/2017/0315/b020deb9331246ad8321d498014229a8_195229_136.jpg","title":"张智霖称顺其自然生女","roomId":""}]
     * totalPnum : 520
     */
    @ColumnInfo
    private int pnum;
    @ColumnInfo
    private int totalRecords;
    @ColumnInfo
    private int records;
    @ColumnInfo
    private int totalPnum;

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getTotalPnum() {
        return totalPnum;
    }

    public void setTotalPnum(int totalPnum) {
        this.totalPnum = totalPnum;
    }
}

