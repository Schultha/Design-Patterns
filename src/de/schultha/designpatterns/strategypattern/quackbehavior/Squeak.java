package de.schultha.designpatterns.strategypattern.quackbehavior;

/**
 * Created by Schultha on 06.02.2017.
 */
public class Squeak implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
