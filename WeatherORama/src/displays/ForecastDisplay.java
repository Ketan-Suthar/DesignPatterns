package displays;

import subjects.ISubject;

public class ForecastDisplay implements IObserver {
    private float temperature;
    private float humidity;
    private final ISubject weatherData;

    public ForecastDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("ForecastDisplay: " + temperature
                + " F degrees and " + humidity + "% humidity");
    }

    public void deregister() {
        weatherData.removeObserver(this);
    }
}
