package online.devplanet.Basics.LLDpattern.DecoratorPattern.GoodCode;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}
