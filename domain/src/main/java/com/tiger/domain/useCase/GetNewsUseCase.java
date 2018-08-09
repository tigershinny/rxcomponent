package com.tiger.domain.useCase;

import android.content.Context;

import com.tiger.domain.NoArgQueryUseCase;
import com.tiger.repository.DataSource;
import com.tiger.repository.IDataSource;
import com.tiger.repository.dto.News;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;

public class GetNewsUseCase extends NoArgQueryUseCase<List<News>> {

    private IDataSource dataSource;

    public GetNewsUseCase(Scheduler workScheduler, Scheduler observeScheduler, Context context) {
        super(workScheduler, observeScheduler);
        dataSource = new DataSource(context);
    }

    @Override
    protected Single<List<News>> buildUseCaseObservable() {
        return dataSource.getNews();
    }
}
