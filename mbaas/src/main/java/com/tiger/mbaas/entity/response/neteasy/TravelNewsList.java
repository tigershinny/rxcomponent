package com.tiger.mbaas.entity.response.neteasy;

import com.google.gson.annotations.SerializedName;
import com.tiger.mbaas.Constants;

import java.util.ArrayList;

/**
 * Created by PandaQ on 2016/9/20.
 * email : 767807368@qq.com
 */

public class TravelNewsList {

    @SerializedName(Constants.NETEASY_NEWS_TRAVEL)

    private ArrayList<NewsBean> mTrivelNewsArrayList;

    public ArrayList<NewsBean> getTrivelNewsArrayList() {
        return mTrivelNewsArrayList;
    }
}
