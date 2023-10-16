package displays;

import subjects.ISubject;

public class StatisticsDisplay implements IObserver {
    private float temperature;
    private float humidity;
    private final ISubject weatherData;

    public StatisticsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("StatisticsDisplay: " + temperature
                + " F degrees and " + humidity + "% humidity");
    }

    public void deregister() {
        weatherData.removeObserver(this);
    }
}
