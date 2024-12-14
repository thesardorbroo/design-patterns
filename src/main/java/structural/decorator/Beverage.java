package structural.decorator;

public abstract class Beverage {

    private final String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
