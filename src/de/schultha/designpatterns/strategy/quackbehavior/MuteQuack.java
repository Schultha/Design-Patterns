package de.schultha.designpatterns.strategy.quackbehavior;

/**
 * Created by Schultha on 06.02.2017.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
