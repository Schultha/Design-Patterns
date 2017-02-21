package de.schultha.designpatterns.decorator.components;

import de.schultha.designpatterns.decorator.Beverage;

/**
 * Created by alexs on 21.02.2017.
 */
public class DarkRoast extends Beverage {


    public DarkRoast(){
        description = "Dark Roast";
    }


    @Override
    public float cost() {
        return .99f;
    }
}
