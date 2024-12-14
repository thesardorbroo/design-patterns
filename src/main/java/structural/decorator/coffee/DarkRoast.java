package structural.decorator.coffee;

import structural.decorator.Beverage;

public class DarkRoast extends Beverage {

    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
