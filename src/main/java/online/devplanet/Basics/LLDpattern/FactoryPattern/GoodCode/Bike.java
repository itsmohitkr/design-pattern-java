package online.devplanet.Basics.LLDpattern.FactoryPattern.GoodCode;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by bike");
    }
}
