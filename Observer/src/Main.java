import observers.CurrentConditionsDisplay;
import subjects.WeatherData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 70, 30.4f);
        weatherData.setMeasurements(78, 90, 28.4f);
    }
}