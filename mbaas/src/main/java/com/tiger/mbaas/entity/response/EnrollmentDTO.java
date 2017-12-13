package com.tiger.mbaas.entity.response;

import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class EnrollmentDTO {
    private String id;

    private int courseId;

    // course category (e.g. GE )
    private String courseTypeCode;

    private String courseName;

    private boolean isCurrent;

    private List<EnrollmentLevelDTO> levels;

    public List<EnrollmentLevelDTO> getLevels() {
        return levels;
    }

    public void setLevels(List<EnrollmentLevelDTO> levels) {
        this.levels = levels;
    }

    public String getId() {
        return id;
    }

    public int getCourseId() {
        return courseId;
    }

    private EnrollmentLevelDTO getCurrentLevel() {
        if (levels != null) {
            for (EnrollmentLevelDTO levelElement : levels) {
                if (levelElement.isCurrent) {
                    return levelElement;
                }
            }
        }
        return null;
    }

    public int getUnitId() {
        return getCurrentLevel().unitId;
    }

    public int getLevelId() {
        return getCurrentLevel().levelId;
    }

    public String getLevelDisplayName() {
        return getCurrentLevel().levelDisplayName;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public String getCourseTypeCode() {
        return courseTypeCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
