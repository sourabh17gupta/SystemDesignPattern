package Observor;

import Observable.concreteObservable;

public interface IObservor {
    void update(concreteObservable observable);
}
