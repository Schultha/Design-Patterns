package de.schultha.designpatterns.observer.display;

import de.schultha.designpatterns.observer.observer.Observer;
import de.schultha.designpatterns.observer.subject.WeatherData;

/**
 * Created by alexs on 13.02.2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }
}
