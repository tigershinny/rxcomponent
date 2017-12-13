package com.tiger.mbaas.entity.response;

/**
 * Created by tigershen on 2017/12/12.
 */

public class ErrorMetaDataDTO {
    private String errorTypeCode;
    private String startupTitle;
    private String startupMessage;
    /***
     * Market sensitive url for downloading apk.
     */
    private String url;

    /***
     * Actual apk file url for downloading apk.
     */
    private String correctDownloadApkUrl;

    private String correctDownloadApkMd5;

    private String correctDownloadApkPackageName;

    private String clientAction;

    public ErrorMetaDataDTO() {
    }

    public ErrorMetaDataDTO(String errorTypeCode, String startupTitle, String startupMessage, String correctDownloadURL) {
        this.errorTypeCode = errorTypeCode;
        this.startupTitle = startupTitle;
        this.startupMessage = startupMessage;
        this.url = correctDownloadURL;
    }

    public String getErrorTypeCode() {
        return errorTypeCode;
    }

    public String getStartupTitle() {
        return startupTitle;
    }

    public String getStartupMessage() {
        return startupMessage;
    }

    /***
     * Gets market sensitive download url.
     *
     * @return
     */
    public String getCorrectDownloadURL() {
        return url;
    }

    /***
     * Gets actual apk download url.
     *
     * @return
     */
    public String getCorrectDownloadApkUrl() {
        return correctDownloadApkUrl;
    }

    public String getCorrectDownloadApkMd5() {
        return correctDownloadApkMd5;
    }

    public String getCorrectDownloadApkPackageName() {
        return correctDownloadApkPackageName;
    }

    public String getClientAction() {
        return clientAction;
    }
}