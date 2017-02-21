package de.schultha.designpatterns.decorator.components;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public class Decaf extends Beverage {


    public Decaf(){
        description = "Decaf";
    }


    @Override
    public float cost() {
        return 1.05f;
    }
}
