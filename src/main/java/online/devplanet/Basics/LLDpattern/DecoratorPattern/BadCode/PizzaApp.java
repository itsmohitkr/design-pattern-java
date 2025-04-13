package online.devplanet.Basics.LLDpattern.DecoratorPattern.BadCode;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new CheeseOlivePizza();
        System.out.println(pizza.cost());
        System.out.println(pizza.description());
    }
}
