package online.devplanet.Basics.LLDpattern.NullObjectPattern;

public class NullObjectPattern {
    public static void main(String[] args) {

        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        System.out.println("Vehicle Tank Capacity: " + vehicle1.getVehicleTankCapacity());
        System.out.println("Vehicle Seating Capacity: " + vehicle1.getVehicleSeatingCapacity());


        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
        System.out.println("Vehicle Tank Capacity: " + vehicle2.getVehicleTankCapacity());
        System.out.println("Vehicle Seating Capacity: " + vehicle2.getVehicleSeatingCapacity());




    }
}
