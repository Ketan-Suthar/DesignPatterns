import java.util.HashSet;
import java.util.Set;

public class Topic implements Subject {
    private final Set<Observer> observers;
    private String message;
    private boolean change;

    public Topic() {
        observers = new HashSet<>();
        change = false;
    }

    public void register(final Observer newObserver) {
        if(newObserver != null)
            observers.add(newObserver);
    }

    public void unregister(final Observer newObserver) {
        observers.remove(newObserver);
    }

    public synchronized void notifyObservers() {
        if(!change) return;

        for(final var obs: observers){
            obs.update();
        }
    }

    public Object getUpdate() {
        return this.message;
    }

    public void postMessage(final Object message) {
        System.out.println("posting message from topic: " + message);
        this.message = (String) message;
        change = true;
        notifyObservers();
    }
}
