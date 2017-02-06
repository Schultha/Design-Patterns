package de.schultha.designpatterns.strategypattern.model;

import de.schultha.designpatterns.strategypattern.quackbehavior.QuackBehavior;
import de.schultha.designpatterns.strategypattern.flybehavior.FlyBehavior;

/**
 * Created by Schultha on 05.02.2017.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
