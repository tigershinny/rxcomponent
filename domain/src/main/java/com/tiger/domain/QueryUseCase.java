package com.tiger.domain;


import io.reactivex.Flowable;
import io.reactivex.Scheduler;

public abstract class QueryUseCase<R, T> {

    private final Scheduler mWorkScheduler;
    private final Scheduler mObserveScheduler;

    protected QueryUseCase(Scheduler workScheduler, Scheduler observeScheduler) {
        this.mWorkScheduler = workScheduler;
        this.mObserveScheduler = observeScheduler;
    }

    public Flowable<R> run(T params) {
        return buildUseCaseObservable(params)
                .subscribeOn(mWorkScheduler)
                .observeOn(mObserveScheduler);
    }

    protected abstract Flowable<R> buildUseCaseObservable(final T params);
}

