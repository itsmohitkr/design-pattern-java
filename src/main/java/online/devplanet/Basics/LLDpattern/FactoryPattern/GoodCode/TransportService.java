package online.devplanet.Basics.LLDpattern.FactoryPattern.GoodCode;

public class TransportService {
    public static void main(String[] args) {
//        Transport transport1= new Car();
//        Transport transport2= new Bike();
//        transport1.deliver();
//        transport2.deliver();
//        Transport transport3= new Bus();
//        transport3.deliver();

        // instead of creating objects directly, we use the factory method
        Transport transport1 = TransportFactory.CreateTransport("car");
        Transport transport2 = TransportFactory.CreateTransport("bike");
        transport1.deliver();
        transport2.deliver();

        System.out.println("-------- newly created transport object ---------");
        Transport transport3 = TransportFactory.CreateTransport("bus");
        transport3.deliver();

    }
}
