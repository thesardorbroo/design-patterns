package behavioral.observer;

public class Main {

    public static void main(String[] args) {

        WeatherData sub = new WeatherData();
        new CurrentConditionsDisplay(sub);
        new ForecastDisplay(sub);

        sub.setMeasurements(1.0f, 1.0f, 1.0f);
    }
}
