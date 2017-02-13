package de.schultha.designpatterns.observer;

import de.schultha.designpatterns.observer.display.CurrentConditionsDisplay;
import de.schultha.designpatterns.observer.display.ForecastDisplay;
import de.schultha.designpatterns.observer.display.HeatIndexDisplay;
import de.schultha.designpatterns.observer.display.StatisticsDisplay;
import de.schultha.designpatterns.observer.subject.WeatherData;

/**
 * Created by alexs on 13.02.2017.
 */
public class WeatherStation {

    public static void main(String ... args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(26, 65, 30.4f);
        weatherData.setMeasurements(27, 70, 29.2f);
        weatherData.setMeasurements(25, 90, 29.2f);

    }

}
