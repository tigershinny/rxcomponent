package com.tiger.mbaas.entity.response;

/**
 * Created by tigershen on 2017/12/13.
 */

public class ServiceResponse {
    protected int errorCode = 0;
    protected String errorDescription;
    protected long lastUpdate;

    public ServiceResponse() {
    }

    protected ErrorMetaDataDTO errorMetaData;

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public ErrorMetaDataDTO getErrorMetaData() {
        return errorMetaData;
    }

    public boolean isOK() {
        return errorCode == 0;
    }
}
