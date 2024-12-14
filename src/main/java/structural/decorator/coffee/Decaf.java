package structural.decorator.coffee;

import structural.decorator.Beverage;

public class Decaf extends Beverage {

    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
