package de.schultha.designpatterns.observer.display;

import de.schultha.designpatterns.observer.observer.Observer;
import de.schultha.designpatterns.observer.subject.WeatherData;

/**
 * Created by alexs on 13.02.2017.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private float maxTemp;
    private float minTemp;
    private float avgTemp;
    private float counter;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temp = weatherData.getTemp();

        if(counter != 0) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }else if (temp < minTemp) {
                minTemp = temp;
            }
            avgTemp += temp;
        }else {
            maxTemp = temp;
            minTemp = temp;
            avgTemp = temp;
        }

        counter++;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + avgTemp/counter + " / " + maxTemp + " / " + minTemp );
    }
}
