package subjects;

import displays.IObserver;

public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
