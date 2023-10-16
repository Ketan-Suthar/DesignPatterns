package subjects;

import displays.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
    private List<IObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        final var ind = observers.indexOf(observer);
        if(ind >= 0){
            observers.remove(ind);
        }
    }

    @Override
    public void notifyObservers() {
        for(final var observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
