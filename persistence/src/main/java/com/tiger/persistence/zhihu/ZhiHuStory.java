package com.tiger.persistence.zhihu;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.tiger.persistence.Converters;

import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by tigershen on 2017/12/13.
 */
@Entity(foreignKeys = @ForeignKey(entity = ZhiHuDaily.class,
        parentColumns = "id",
        childColumns = "daily_id",
        onDelete = CASCADE, onUpdate = CASCADE))
@TypeConverters({Converters.class})
public class ZhiHuStory {

    //时间
    private String date;
    private int type;
    @PrimaryKey
    private int id;
    private String ga_prefix;
    private String title;
    private List<String> images;
    private int daily_id;

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

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDaily_id() {
        return daily_id;
    }

    public void setDaily_id(int daily_id) {
        this.daily_id = daily_id;
    }

}
