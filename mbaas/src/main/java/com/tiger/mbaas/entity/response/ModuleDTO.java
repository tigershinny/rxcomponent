package com.tiger.mbaas.entity.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class ModuleDTO {
    private int moduleId;
    private String title;
    private int type;
    private String introduction;
    private String courseVersion;
    private List<ActivityId> activities = new ArrayList<>();

    public ModuleDTO() {
    }

    public int getModuleId() {
        return moduleId;
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public List<ActivityId> getActivities() {
        return activities;
    }

    public static class ActivityId {
        int activityId;

        public int getActivityId() {
            return activityId;
        }
    }

    public String getCourseVersion() {
        return courseVersion;
    }
}
