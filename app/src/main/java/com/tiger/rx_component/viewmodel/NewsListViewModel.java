package com.tiger.rx_component.viewmodel;

import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.os.Bundle;

import com.tiger.rx_component.BR;

import com.tiger.domain.useCase.GetNewsUseCase;

import io.reactivex.Observable;

public class NewsListViewModel extends BaseDisposableViewModel {

    private GetNewsUseCase getNewsUseCase;

    private ObservableList<NewsItemViewModel> newsList;

    public NewsListViewModel(final GetNewsUseCase getNewsUseCase){

        this.getNewsUseCase = getNewsUseCase;
        newsList = new ObservableArrayList<>();
    }

    @Bindable
    public int getItemBindingId() {
        return BR.model;
    }

    @Bindable
    public ObservableList<NewsItemViewModel> getNewsList() {
        return newsList;
    }

    @Override
    public void onLoad(Bundle bundle) {
        addDisposable(
                getNewsUseCase.run()
                        .flatMapObservable(Observable::fromIterable)
                        .subscribe(
                                news -> newsList.add(new NewsItemViewModel(news))
                        )
        );
    }
}
