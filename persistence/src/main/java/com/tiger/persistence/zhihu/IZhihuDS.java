package com.tiger.persistence.zhihu;


import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/15.
 */

public interface IZhihuDS {

    Flowable<List<ZhiHuStory>> getDailyStory(int id);

    Flowable<List<ZhiHuTopStory>> getDailyTopStory(int id);

    Flowable<ZhihuStoryContent> getStoryContent(int id);

    void insertOrUpdateDaily(ZhiHuDaily daily);

    void insertOrUpdateStoryContent(ZhihuStoryContent storyContent);

    void deleteAllDailies();
}
