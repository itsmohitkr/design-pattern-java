package online.devplanet.Basics.LLDpattern.NullObjectPattern;

public class NullVehicle implements Vehicle {
    @Override
    public int getVehicleTankCapacity() {
        return 0;
    }

    @Override
    public int getVehicleSeatingCapacity() {
        return 0;
    }
}
