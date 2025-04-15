package online.devplanet.Basics.LLDpattern.NullObjectPattern;

public class Car implements Vehicle{

    @Override
    public int getVehicleTankCapacity() {
        return 30;
    }

    @Override
    public int getVehicleSeatingCapacity() {
        return 5;
    }
}
