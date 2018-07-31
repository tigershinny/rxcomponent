package com.tiger.repository.mbaas.ApiManager;

import com.tiger.repository.mbaas.Config;
import com.tiger.repository.mbaas.api.ZhihuDailyApi;
import com.tiger.repository.mbaas.response.zhihu.ZhiHuDaily;
import com.tiger.repository.mbaas.response.zhihu.ZhihuStoryContent;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tigershen on 2017/12/13.
 */

public class ZhihuManager extends ApiManager<ZhihuDailyApi> {

    private static ZhihuManager zhihuManager;

    private ZhihuManager() {
        super(Config.ZHIHU_API_URL);
    }

    public static ZhihuManager getInstence() {
        if (zhihuManager == null) {
            synchronized (ZhihuManager.class) {
                if (zhihuManager == null) {
                    zhihuManager = new ZhihuManager();
                }
            }
        }
        return zhihuManager;
    }

    public Observable<ZhiHuDaily> getLatestZhihuDaily() {
        return getService().getLatestZhihuDaily()
                .subscribeOn(Schedulers.io());
    }

    public Observable<ZhiHuDaily> getZhihuDaily(String date) {
        return getService().getZhihuDaily(date)
                .subscribeOn(Schedulers.io());
    }

    public Observable<ZhihuStoryContent> getStoryContent(String id) {
        return getService().getStoryContent(id)
                .subscribeOn(Schedulers.io());
    }
}
