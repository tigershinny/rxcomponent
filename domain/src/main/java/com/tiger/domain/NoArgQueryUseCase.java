package com.tiger.domain;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

public abstract class NoArgQueryUseCase<R> {
    private final Scheduler mWorkScheduler;
    private final Scheduler mObserveScheduler;

    public NoArgQueryUseCase(Scheduler workScheduler, Scheduler observeScheduler) {
        this.mWorkScheduler = workScheduler;
        this.mObserveScheduler = observeScheduler;
    }

    public Flowable<R> run() {
        return buildUseCaseObservable()
                .subscribeOn(mWorkScheduler)
                .observeOn(mObserveScheduler);
    }

    protected abstract Flowable<R> buildUseCaseObservable();

}
