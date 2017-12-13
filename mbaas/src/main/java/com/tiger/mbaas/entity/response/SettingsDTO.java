package com.tiger.mbaas.entity.response;

import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class SettingsDTO {

    private boolean enableUpdateApkInApp;
    private String newAppVersion;
    private String minAppVersion;
    private String newAppApkMD5;
    private String newAppApkURL;
    private String newAppURL;
    private List<CultureCodeDTO> cultureCodes;
    /**
     * Interval time for resubmitting the WritingAnswers.
     * <p/>
     * The value will be ignored if you remove this field in the configuration or set its value to 0.
     */
    private int writingSyncIntervalMinute;

    private List<MaxCourseVersionDTO> maxCourseVersions; // Max course version info.

    public void setEnableUpdateApkInApp(boolean enableUpdateApkInApp) {
        this.enableUpdateApkInApp = enableUpdateApkInApp;
    }

    public void setNewAppVersion(String newAppVersion) {
        this.newAppVersion = newAppVersion;
    }

    public void setMinAppVersion(String minAppVersion) {
        this.minAppVersion = minAppVersion;
    }

    public void setNewAppApkMD5(String newAppApkMD5) {
        this.newAppApkMD5 = newAppApkMD5;
    }

    public void setNewAppApkURL(String newAppApkURL) {
        this.newAppApkURL = newAppApkURL;
    }

    public void setNewAppURL(String newAppURL) {
        this.newAppURL = newAppURL;
    }

    public boolean getEnableUpdateApkInApp() {
        return enableUpdateApkInApp;
    }

    public String getNewAppVersion() {
        return newAppVersion;
    }

    public String getMinAppVersion() {
        return minAppVersion;
    }

    public String getNewAppApkMD5() {
        return newAppApkMD5;
    }

    public String getNewAppApkURL() {
        return newAppApkURL;
    }

    public String getNewAppURL() {
        return newAppURL;
    }

    public List<CultureCodeDTO> getCultureCodes() {
        return cultureCodes;
    }

    public void setCultureCodes(List<CultureCodeDTO> cultureCodes) {
        this.cultureCodes = cultureCodes;
    }

    public List<MaxCourseVersionDTO> getMaxCourseVersions() {
        return maxCourseVersions;
    }

    public void setMaxCourseVersions(List<MaxCourseVersionDTO> maxCourseVersions) {
        this.maxCourseVersions = maxCourseVersions;
    }

    public int getWritingSyncIntervalMinute() {
        return writingSyncIntervalMinute;
    }

    public void setWritingSyncIntervalMinute(int writingSyncIntervalMinute) {
        this.writingSyncIntervalMinute = writingSyncIntervalMinute;
    }
}
