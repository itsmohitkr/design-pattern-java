package online.devplanet.Basics.LLDpattern.DecoratorPattern.BadCode;

public class CheesePizza extends BasicPizza{
    @Override
    public String description() {
        return super.description() + ", cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
