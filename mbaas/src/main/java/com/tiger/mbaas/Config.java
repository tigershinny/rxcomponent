package com.tiger.mbaas;

import java.util.Map;

/**
 * Created by tigershen on 2017/12/13.
 */

public class Config {
    final int productId;
    final String platform;
    final String appVersion;
    final boolean debug;

    private String BASE_URL;
    private Map<String, String> headers;

    public Config(String BASE_URL, int productId, String platform, String appVersion, boolean debug) {
        this.BASE_URL = BASE_URL;
        this.productId = productId;
        this.platform = platform;
        this.appVersion = appVersion;
        this.debug = debug;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setBASE_URL(String BASE_URL) {
        this.BASE_URL = BASE_URL;
    }
}
