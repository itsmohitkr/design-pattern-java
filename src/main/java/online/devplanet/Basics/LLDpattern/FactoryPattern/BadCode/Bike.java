package online.devplanet.Basics.LLDpattern.FactoryPattern.BadCode
        ;

public class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by bike");
    }
}
