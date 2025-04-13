package online.devplanet.Basics.LLDpattern.DecoratorPattern.GoodCode;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
