package online.devplanet.Basics.InterviewQuestion.LLDcarRentalSyatem;

import online.devplanet.Basics.InterviewQuestion.LLDcarRentalSyatem.Model.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    // This class is responsible for managing the vehicle inventory
    // It will have methods to add, remove, and update vehicles in the inventory
    // It will also have methods to get the list of available vehicles

    List<Vehicle>vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
