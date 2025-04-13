package online.devplanet.Basics.LLDpattern.FactoryPattern.GoodCode;

public class TransportFactory {

    public static Transport CreateTransport(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "bus" -> new Bus();
            default -> throw new IllegalArgumentException("Unknown transport type: " + type);
        };

    }
}
