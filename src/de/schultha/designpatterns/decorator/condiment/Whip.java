package de.schultha.designpatterns.decorator.condiment;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public float cost() {
        return beverage.cost() + .10f;
    }
}
