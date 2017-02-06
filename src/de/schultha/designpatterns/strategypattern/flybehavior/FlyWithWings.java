package de.schultha.designpatterns.strategypattern.flybehavior;

/**
 * Created by Schultha on 05.02.2017.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
