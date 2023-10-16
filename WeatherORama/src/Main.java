import displays.CurrentConditionsDisplay;
import displays.ForecastDisplay;
import displays.IObserver;
import displays.StatisticsDisplay;
import subjects.ISubject;
import subjects.WeatherData;

public class Main {
    public static void main(String[] args) {
        final var weatherData = new WeatherData();
        final var currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        final var staticDisplay = new StatisticsDisplay(weatherData);
        final var forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(865, 563, 100.4f);
    }
}