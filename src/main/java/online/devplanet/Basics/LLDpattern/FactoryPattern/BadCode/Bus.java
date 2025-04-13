package online.devplanet.Basics.LLDpattern.FactoryPattern.BadCode;


public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by bus");
    }
}
