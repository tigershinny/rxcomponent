package com.tiger.rx_component.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.tiger.repository.dto.News;
import com.tiger.rx_component.BR;

public class NewsItemViewModel extends BaseObservable {

    private News news;

    public NewsItemViewModel(News news){
        this.news = news;
        notifyPropertyChanged(BR.model);
    }

    @Bindable
    public String getTitle() {
        return news.getTitle();
    }

    @Bindable
    public String getDigest() {
        return news.getDigest();
    }

    @Bindable
    public String getImgsrc() {
        return news.getImgsrc();
    }

    @Bindable
    public String getSource() {
        return news.getSource();
    }

    @Bindable
    public String getPtime() {
        return news.getPtime();
    }

    @Bindable
    public String getUrl() {
        return news.getUrl();
    }
}
