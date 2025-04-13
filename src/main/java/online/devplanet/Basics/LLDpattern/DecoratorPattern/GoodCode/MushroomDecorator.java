package online.devplanet.Basics.LLDpattern.DecoratorPattern.GoodCode;

public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 3.00;
    }
}
