package de.schultha.designpatterns.observer.subject;

import de.schultha.designpatterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexs on 13.02.2017.
 */
public class WeatherData implements Subject {

    List<Observer> observers;
    private float humidity;
    private float temp;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        setTemp(temp);
        setHumidity(humidity);
        setPressure(pressure);
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
