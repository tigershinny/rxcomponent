package com.tiger.domain;

import io.reactivex.Scheduler;
import io.reactivex.Single;

public abstract class NoArgQueryUseCase<R> {
    private final Scheduler mWorkScheduler;
    private final Scheduler mObserveScheduler;

    public NoArgQueryUseCase(Scheduler workScheduler, Scheduler observeScheduler) {
        this.mWorkScheduler = workScheduler;
        this.mObserveScheduler = observeScheduler;
    }

    public Single<R> run() {
        return buildUseCaseObservable()
                .subscribeOn(mWorkScheduler)
                .observeOn(mObserveScheduler);
    }

    protected abstract Single<R> buildUseCaseObservable();

}
