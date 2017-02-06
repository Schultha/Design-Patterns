package de.schultha.designpatterns.strategypattern.model;

import de.schultha.designpatterns.strategypattern.flybehavior.FlyWithWings;
import de.schultha.designpatterns.strategypattern.quackbehavior.Quack;

/**
 * Created by Schultha on 06.02.2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
