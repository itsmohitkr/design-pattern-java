package online.devplanet.Basics.LLDpattern.NullObjectPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Car")){
            return new Car();
        }
        return new NullVehicle();
    }
}
