package com.tiger.repository.mbaas.response.zhihu;

import java.io.Serializable;

/**
 * Created by tigershen on 2017/12/13.
 */

public class ZhiHuTopStory implements Serializable {
    private String image;
    private int type;
    private int id;
    private String ga_prefix;
    private String title;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
