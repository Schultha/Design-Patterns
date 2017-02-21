package de.schultha.designpatterns.decorator;

/**
 * Created by alexs on 21.02.2017.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public enum Size { TALL, GRANDE, VENTI };

    protected Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract float cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
