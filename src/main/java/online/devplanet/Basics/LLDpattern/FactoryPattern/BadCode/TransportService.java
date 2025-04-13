package online.devplanet.Basics.LLDpattern.FactoryPattern.BadCode;

public class TransportService {
    public static void main(String[] args) {
        Transport transport1= new Car();
        Transport transport2= new Bike();
        transport1.deliver();
        transport2.deliver();
        Transport transport3= new Bus();
        transport3.deliver();

    }
}
