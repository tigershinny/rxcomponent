package com.tiger.persistence.neteasy;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
/**
 * Created by tigershen on 2017/12/13.
 */
@Entity
public class NewsBean {

    @PrimaryKey(autoGenerate = true)
    private int id;
    /**
     * type 0 health, 1 millitary, 2 relax, 3 sport, 4 tec, 5 top, 6 travel
     */
    @ColumnInfo
    private int type;
    /**
     * docid
     */
    @ColumnInfo
    private String docid;
    /**
     * 标题
     */
    @ColumnInfo
    private String title;
    /**
     * 小内容
     */
    @ColumnInfo
    private String digest;
    /**
     * 图片地址
     */
    @ColumnInfo
    private String imgsrc;
    /**
     * 来源
     */
    @ColumnInfo
    private String source;
    /**
     * 时间
     */
    @ColumnInfo
    private String ptime;
    /**
     * url
     */
    @ColumnInfo
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
