package Observable;

import Observor.IObservor;

public interface IObservable {
    void addObservor(IObservor observor);
    void deleteObservor(IObservor observer);
    void notifyObservers();
}
