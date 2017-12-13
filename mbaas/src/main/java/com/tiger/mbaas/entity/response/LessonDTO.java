package com.tiger.mbaas.entity.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class LessonDTO {
    private int lessonId;
    private String title;
    private String details;
    private String imagePath;
    private String imageId;
    private String courseVersion;
    private String imageAlignment;
    private List<ModuleDTO> modules = new ArrayList<>();

    public LessonDTO() {
    }

    public int getLessonId() {
        return lessonId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getImagePath() {
        return imagePath;
    }

    public List<ModuleDTO> getModules() {
        return modules;
    }

    public String getCourseVersion() {
        return courseVersion;
    }

    public String getImageAlignment() {
        return imageAlignment;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
