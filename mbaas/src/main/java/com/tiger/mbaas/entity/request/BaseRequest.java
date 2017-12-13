package com.tiger.mbaas.entity.request;

import com.tiger.mbaas.AppConfig;

/**
 * Created by tigershen on 2017/12/13.
 */

public class BaseRequest {
    Object serviceRequest;

    public static class BaseTokenRequest {
        String token;
        String culturecode;
        String sessionId;

        int productId;
        String platform;
        String appVersion;

        public BaseTokenRequest(String token, String culturecode, String sessionId) {
            this.token = token;
            this.culturecode = culturecode;

            this.sessionId = sessionId;

            productId = AppConfig.productId;
            platform = AppConfig.platform;
            appVersion = AppConfig.appVersion;
        }
    }

    public static class BaseGetContentRequest extends BaseTokenRequest {
        String countrycode;
        String partnercode;
        String siteversion;

        public BaseGetContentRequest(BaseTokenRequest tokenRequest, String countryCode, String partnerCode, String siteVersion) {
            super(tokenRequest.token, tokenRequest.culturecode, tokenRequest.sessionId);
            this.countrycode = countryCode;
            this.partnercode = partnerCode;
            this.siteversion = siteVersion;
        }

        public BaseGetContentRequest(String token, String culturecode, String sessionId, String countryCode, String partnerCode, String siteVersion) {
            super(token, culturecode, sessionId);
            this.countrycode = countryCode;
            this.partnercode = partnerCode;
            this.siteversion = siteVersion;
        }

        public BaseGetContentRequest(BaseGetContentRequest getContentRequest) {
            this(getContentRequest.token, getContentRequest.culturecode, getContentRequest.sessionId, getContentRequest.countrycode, getContentRequest.partnercode, getContentRequest.siteversion);
        }
    }

    //FIXME: Temporarily here to fix the issue of switching language. Should be remove later after doing the refactoring.
    public static class BaseBlurbGetContentRequest {
        String token;
        String sessionId;
        String countrycode;
        String partnercode;
        String siteversion;
        int productId;
        String platform = "Android";
        String appVersion = "1.0.0";

        public BaseBlurbGetContentRequest(String token, String sessionId, String countryCode, String partnerCode, String siteVersion) {
            this.token = token;
            this.sessionId = sessionId;
            this.countrycode = countryCode;
            this.partnercode = partnerCode;
            this.siteversion = siteVersion;
            productId = AppConfig.productId;
            platform = AppConfig.platform;
            appVersion = AppConfig.appVersion;
        }

        public BaseBlurbGetContentRequest(BaseBlurbGetContentRequest baseBlurbGetContentRequest) {
            this(baseBlurbGetContentRequest.token, baseBlurbGetContentRequest.sessionId, baseBlurbGetContentRequest.countrycode, baseBlurbGetContentRequest.partnercode, baseBlurbGetContentRequest.siteversion);
        }
    }
}
