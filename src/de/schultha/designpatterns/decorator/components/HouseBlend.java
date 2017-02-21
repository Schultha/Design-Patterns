package de.schultha.designpatterns.decorator.components;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public class HouseBlend extends Beverage {


    public HouseBlend(){
        description = "House Blend";
    }


    @Override
    public float cost() {
        return .89f;
    }
}
