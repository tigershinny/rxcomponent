package com.tiger.mbaas.entity.response.neteasy;

import com.google.gson.annotations.SerializedName;
import com.tiger.mbaas.Constants;

import java.util.ArrayList;

/**
 * Created by tigershen on 2017/12/13.
 */

public class TopNewsList {
    @SerializedName(Constants.NETEASY_NEWS_HEADLINE)

    private ArrayList<NewsBean> mTopNewsArrayList;

    public ArrayList<NewsBean> getTopNewsArrayList() {
        return mTopNewsArrayList;
    }

}
