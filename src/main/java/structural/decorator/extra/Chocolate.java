package structural.decorator.extra;

import structural.decorator.Beverage;
import structural.decorator.CondimentDecorator;

public class Chocolate extends CondimentDecorator {

    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
