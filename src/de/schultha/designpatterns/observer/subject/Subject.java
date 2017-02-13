package de.schultha.designpatterns.observer.subject;

import de.schultha.designpatterns.observer.observer.Observer;

/**
 * Created by alexs on 13.02.2017.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();

}
