package de.schultha.designpatterns.decorator.condiment;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        float costs;
        switch (size) {
            case TALL:
                costs = .10f;
                break;
            case GRANDE:
                costs = .15f;
                break;
            case VENTI:
                costs = .20f;
                break;
            default:
                costs = .20f;
        }
        return beverage.cost() + costs;
    }
}
