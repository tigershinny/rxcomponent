package com.tiger.persistence.zhihu;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by tigershen on 2017/12/15.
 */

public class ZhihuDS implements IZhihuDS {

    private ZhihuDao zhihuDao;

    public ZhihuDS(ZhihuDao zhihuDao){
        this.zhihuDao = zhihuDao;
    }

    @Override
    public Flowable<List<ZhiHuStory>> getDailyStory(int id) {
        return zhihuDao.getDailyStroies(id);
    }

    @Override
    public Flowable<List<ZhiHuTopStory>> getDailyTopStory(int id) {
        return zhihuDao.getDailyTopStroies(id);
    }

    @Override
    public Flowable<ZhihuStoryContent> getStoryContent(int id) {
        return zhihuDao.getStoryContent(id);
    }

    @Override
    public void insertOrUpdateDaily(ZhiHuDaily daily) {
        zhihuDao.insertZhiHuDaily(daily);
    }


    @Override
    public void insertOrUpdateStoryContent(ZhihuStoryContent storyContent) {
        zhihuDao.insertStoryContent(storyContent);
    }

    @Override
    public void deleteAllDailies() {
        zhihuDao.deleteAllDaily();
    }
}
