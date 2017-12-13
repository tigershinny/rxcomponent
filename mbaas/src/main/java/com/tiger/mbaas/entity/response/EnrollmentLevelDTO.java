package com.tiger.mbaas.entity.response;

/**
 * Created by tigershen on 2017/12/13.
 */

public class EnrollmentLevelDTO {
    boolean isCurrent;
    int orderId;
    int levelId;
    String levelDisplayName;
    String imagePath;
    String state;
    int unitId;

    public EnrollmentLevelDTO() {
    }

    public EnrollmentLevelDTO(boolean isCurrent, int orderId, int levelId, String levelDisplayName, int unitId) {
        this.isCurrent = isCurrent;
        this.orderId = orderId;
        this.levelId = levelId;
        this.levelDisplayName = levelDisplayName;
        this.unitId = unitId;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    //    @JsonProperty("isCurrent")
    public void setCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getLevelDisplayName() {
        return levelDisplayName;
    }

    public void setLevelDisplayName(String levelDisplayName) {
        this.levelDisplayName = levelDisplayName;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
