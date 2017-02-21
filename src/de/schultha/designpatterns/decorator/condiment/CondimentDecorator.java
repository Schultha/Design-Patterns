package de.schultha.designpatterns.decorator.condiment;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
