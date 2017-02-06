package de.schultha.designpatterns.strategypattern.quackbehavior;

/**
 * Created by alexs on 06.02.2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
