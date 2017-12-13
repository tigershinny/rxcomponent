package com.tiger.mbaas;

/**
 * Created by tigershen on 2017/12/13.
 */

public class AppConfig {
    public static int productId;
    public static String platform;
    public static String appVersion;

    public static void setAppConfig(int aproductId, String aplatform, String aappVersion) {
        productId = aproductId;
        platform = aplatform;
        appVersion = aappVersion;
    }
}
