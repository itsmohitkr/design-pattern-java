package online.devplanet.Basics.LLDpattern.FactoryPattern.BadCode;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by car");
    }
}
