package Observor;

import Observable.concreteObservable;

public class concreteObservor implements IObservor {
    private String name;
    
    public concreteObservor(String name) {
        this.name = name;
    }

    @Override
    public void update(concreteObservable observable) {
        System.out.println("Hey " + name + "," + observable.getVideoData());
    }
}
