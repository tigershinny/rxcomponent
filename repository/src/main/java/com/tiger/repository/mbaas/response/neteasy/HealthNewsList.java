package com.tiger.repository.mbaas.response.neteasy;

import com.google.gson.annotations.SerializedName;
import com.tiger.repository.mbaas.Constants;

import java.util.ArrayList;

/**
 * Created by PandaQ on 2016/9/20.
 * email : 767807368@qq.com
 */

public class HealthNewsList {

    @SerializedName(Constants.NETEASY_NEWS_HEALTH)

    private ArrayList<NewsBean> mHealthNewsArrayList;

    public ArrayList<NewsBean> getRecNewsArrayList() {
        return mHealthNewsArrayList;
    }
}
