package com.tiger.mbaas.entity.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class CourseDTO {
    private int courseId;
    private String title;
    private List<LevelDTO> levels = new ArrayList<LevelDTO>();

    public CourseDTO() {
    }

    public int getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public List<LevelDTO> getLevels() {
        return levels;
    }
}
