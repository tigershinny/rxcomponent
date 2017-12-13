package com.tiger.mbaas.entity.response;

/**
 * Created by tigershen on 2017/12/13.
 */

public class MaxCourseVersionDTO {
    int id; // Course id.
    String value; // Max course version.

    public int getCourseId() {
        return id;
    }

    public void setCourseId(int courseId) {
        this.id = courseId;
    }

    public String getMaxVersion() {
        return value;
    }

    public void setMaxVersion(String maxVersion) {
        this.value = maxVersion;
    }
}
