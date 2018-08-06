package com.tiger.domain.useCase;

import com.tiger.domain.NoArgQueryUseCase;
import com.tiger.repository.IDataSource;
import com.tiger.repository.dto.News;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

public class GetNewsUseCase extends NoArgQueryUseCase<News> {

    private IDataSource dataSource;

    public GetNewsUseCase(Scheduler workScheduler, Scheduler observeScheduler, IDataSource dataSource) {
        super(workScheduler, observeScheduler);
        this.dataSource = dataSource;
    }

    @Override
    protected Flowable<News> buildUseCaseObservable() {
        return dataSource.getNews();
    }
}
