package de.schultha.designpatterns.decorator;

import de.schultha.designpatterns.decorator.components.DarkRoast;
import de.schultha.designpatterns.decorator.components.HouseBlend;
import de.schultha.designpatterns.decorator.condiment.Mocha;
import de.schultha.designpatterns.decorator.condiment.Soy;
import de.schultha.designpatterns.decorator.condiment.Whip;

/**
 * Created by alexs on 21.02.2017.
 */
public class Starbuzz {

        public static void main(String[] args) {
            Beverage darkRoastMochaWhip = new Whip(new Mocha(new DarkRoast()));
            System.out.println(darkRoastMochaWhip.getDescription() + "\t price: $" + darkRoastMochaWhip.cost());

            Beverage doubleMochaSoyLatteWhip = new Whip(new Mocha(new Mocha(new Soy(new HouseBlend()))));
            System.out.println(doubleMochaSoyLatteWhip.getDescription() + " price: $" + doubleMochaSoyLatteWhip.cost());
        }

}
