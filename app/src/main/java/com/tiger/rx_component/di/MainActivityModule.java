package com.tiger.rx_component.di;

import android.content.Context;

import com.tiger.domain.useCase.GetNewsUseCase;
import com.tiger.rx_component.viewmodel.NewsListViewModel;

import dagger.Module;
import dagger.Provides;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@Module
public class MainActivityModule {

    private final Context context;

    public MainActivityModule(final Context context){
        this.context = context;
    }

    @Provides
    @MainActivityScope
    public GetNewsUseCase provideGetNewsUseCase(){
        return new GetNewsUseCase(Schedulers.io(), AndroidSchedulers.mainThread(), context);
    }

    @Provides
    @MainActivityScope
    public NewsListViewModel provideNewsListViewModel(final GetNewsUseCase getNewsUseCase) {
        return new NewsListViewModel(getNewsUseCase);
    }
}
