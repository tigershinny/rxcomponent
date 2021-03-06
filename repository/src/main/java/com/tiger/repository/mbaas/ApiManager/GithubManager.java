package com.tiger.repository.mbaas.ApiManager;

import com.tiger.repository.mbaas.Config;
import com.tiger.repository.mbaas.api.GithubApi;
import com.tiger.repository.mbaas.response.github.UserInfo;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tigershen on 2017/12/13.
 */

public class GithubManager extends ApiManager<GithubApi>{
    private static GithubManager githubManager;
    private GithubManager() {
        super(Config.GITHUB_API_URL, GithubApi.class);
    }

    public static GithubManager getInstence() {
        if (githubManager == null) {
            synchronized (GithubManager.class) {
                if (githubManager == null) {
                    githubManager = new GithubManager();
                }
            }
        }
        return githubManager;
    }

    public Observable<UserInfo> getUserInfo(String path){
        return getService().getMyInfo(path).subscribeOn(Schedulers.io());
    }
}
