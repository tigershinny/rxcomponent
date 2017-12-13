package com.tiger.mbaas.entity.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class UnitDTO {
    private int unitId;
    private String title;
    private String imagePath;
    private String courseVersion;
    private List<LessonDTO> lessons = new ArrayList<LessonDTO>();

    public UnitDTO() {
    }

    public int getUnitId() {
        return unitId;
    }

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public List<LessonDTO> getLessons() {
        return lessons;
    }

    public String getCourseVersion() {
        return courseVersion;
    }
}
