public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate();

    void postMessage(Object message);
}
