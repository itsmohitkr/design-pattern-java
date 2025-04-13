package online.devplanet.Basics.LLDpattern.DecoratorPattern.GoodCode;

// No one can directly make the object of this PizzaDecorator as this is an abstract class. So, any class will have to first implement the method

abstract class PizzaDecorator implements Pizza{

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza=pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
