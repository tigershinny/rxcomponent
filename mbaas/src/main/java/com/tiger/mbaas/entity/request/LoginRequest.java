package com.tiger.mbaas.entity.request;

import com.tiger.mbaas.AppConfig;

/**
 * Created by tigershen on 2017/12/13.
 */

public class LoginRequest extends BaseRequest {
    public LoginRequest(SubRequest subRequest) {
        this.serviceRequest = subRequest;
    }

    public static class SubRequest {
        final String userName;
        final String password;
        final int productId;
        final String platform;
        final String appVersion;

        public SubRequest(String userName, String password, int productId) {
            this.userName = userName;
            this.password = password;
            this.productId = productId;

            this.platform = AppConfig.platform;
            this.appVersion = AppConfig.appVersion;
        }
    }
}
