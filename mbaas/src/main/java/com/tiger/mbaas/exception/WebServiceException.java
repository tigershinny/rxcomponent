package com.tiger.mbaas.exception;

import com.tiger.mbaas.entity.response.ErrorMetaDataDTO;

import java.io.IOException;

/**
 * Created by tigershen on 2017/12/12.
 */

public class WebServiceException extends IOException {
    int errorCode;
    String errorDescription;
    ErrorMetaDataDTO errorMetaData;

    public WebServiceException(String detailMessage, int errorCode) {
        this(errorCode, detailMessage, null);
    }

    public WebServiceException(int errorCode, String errorDescription, ErrorMetaDataDTO errorMetaData) {
        super(errorDescription);

        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorMetaData = errorMetaData;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public ErrorMetaDataDTO getErrorMetaData() {
        return errorMetaData;
    }

    @Override
    public String toString() {
        return super.toString() + " errorCode = " + errorCode + " errorDescription = " + errorDescription + " errorMetaData = " + errorMetaData;
    }
}
