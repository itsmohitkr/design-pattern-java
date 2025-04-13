package online.devplanet.Basics.LLDpattern.FactoryPattern.GoodCode;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by car");
    }
}
