package com.tiger.persistence.movie;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by tigershen on 2017/12/13.
 */
@Entity
public class CommentsInfo {
    /**
     * pnum : 1
     * totalRecords : 5
     * records : 20
     * list : [{"msg":"❤有空余时间可以找点事做 ✅好评师，打字，分销，代理等多种职位 ✅主要是打小说，快递单，手稿，文稿等 ✅一千字30，两千字60，多劳多得 ✅在家带宝的妈妈，学生 都行 每天90-360元 一部手机就可以做，没有时间限制 咨丶询➕卫信 2\u20e33\u20e36\u20e36\u20e39\u20e38\u20e36\u20e32\u20e32\u20e3\u20e3️联.系！ ","phoneNumber":"Flunky%20","dataId":"ff8080815a64fd2a015a7dcef8071e2b","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/02/10/1486738004568231686.jpg","time":"2017-02-27 12:23:20","likeNum":0}]
     * totalPnum : 1
     */
    @PrimaryKey(autoGenerate = true)
    private int id;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

