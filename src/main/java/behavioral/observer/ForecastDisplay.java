package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentTemperature = 29.06f;
    private float lastTemperature;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        String displayed = String.format("Last temperature: %.2f\nCurrent temperature: %.2f", lastTemperature, currentTemperature);
        System.out.println(displayed);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            lastTemperature = currentTemperature;
            currentTemperature = ((WeatherData) o).getTemperature();
            display();
        }
    }
}
