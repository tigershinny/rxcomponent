package com.tiger.repository.dto;

import com.tiger.repository.persistence.neteasy.NewsEntity;

public class News {

    private String docid;

    private String title;

    private String digest;

    private String imgsrc;

    private String source;

    private String ptime;

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

    public News(){}

    public News(String docid, String title, String digest, String imgsrc, String source, String ptime, String url) {
        this.docid = docid;
        this.title = title;
        this.digest = digest;
        this.imgsrc = imgsrc;
        this.source = source;
        this.ptime = ptime;
        this.url = url;
    }

    public News cloneFrom(NewsEntity entity){
        return new News(
                entity.getDocid(),
                entity.getTitle(),
                entity.getDigest(),
                entity.getImgsrc(),
                entity.getSource(),
                entity.getPtime(),
                entity.getUrl());
    }
}
