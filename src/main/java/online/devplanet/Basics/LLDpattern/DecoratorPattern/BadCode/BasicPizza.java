package online.devplanet.Basics.LLDpattern.DecoratorPattern.BadCode;

public class BasicPizza implements Pizza{

    @Override
    public String description() {
        return "basic pizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
