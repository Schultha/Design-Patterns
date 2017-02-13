package de.schultha.designpatterns.strategy;

import de.schultha.designpatterns.strategy.model.Duck;
import de.schultha.designpatterns.strategy.model.MallardDuck;

/**
 * Created by Schultha on 06.02.2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
    }
}
