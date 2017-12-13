package com.tiger.mbaas.entity.response;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class LevelDTO {
    private int levelId;
    private String title;
    private String courseVersion;
    private List<UnitDTO> units = new ArrayList<UnitDTO>();

    public LevelDTO() {
    }

    public int getLevelId() {
        return levelId;
    }

    public String getTitle() {
        return title;
    }

    public List<UnitDTO> getUnits() {
        return units;
    }

    public String getCourseVersion() {
        return courseVersion;
    }
}
