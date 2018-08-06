package com.tiger.repository.mbaas.response.neteasy;

import com.google.gson.annotations.SerializedName;
import com.tiger.repository.mbaas.Constants;

import java.util.List;

/**
 * Created by tigershen on 2017/12/13.
 */

public class TopNewsList {
    @SerializedName(Constants.NETEASY_NEWS_HEADLINE)

    private List<NewsBean> mTopNewsArrayList;

    public List<NewsBean> getTopNewsArrayList() {
        return mTopNewsArrayList;
    }

}
