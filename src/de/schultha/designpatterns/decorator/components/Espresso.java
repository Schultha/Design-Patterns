package de.schultha.designpatterns.decorator.components;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public class Espresso extends Beverage {


    public Espresso(){
        description = "Espresso";
    }


    @Override
    public float cost() {
        return .89f;
    }
}
