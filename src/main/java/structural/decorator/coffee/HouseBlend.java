package structural.decorator.coffee;

import structural.decorator.Beverage;

public class HouseBlend extends Beverage {

    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
