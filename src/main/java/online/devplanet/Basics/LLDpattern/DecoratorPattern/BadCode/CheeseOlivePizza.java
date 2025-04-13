package online.devplanet.Basics.LLDpattern.DecoratorPattern.BadCode;

public class CheeseOlivePizza extends CheesePizza{
    @Override
    public String description() {
        return super.description() + ", olive";
    }

    @Override
    public double cost() {
        return super.cost() + 2.5;
    }

}
