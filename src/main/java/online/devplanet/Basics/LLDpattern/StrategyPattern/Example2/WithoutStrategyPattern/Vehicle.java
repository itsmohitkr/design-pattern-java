package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithoutStrategyPattern;

public class Vehicle {
    public void drive() {
        System.out.println("normal drive capability");
    }
}

class SportsVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}

class PassangerVehicle extends Vehicle {

}

class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}

class GoodsVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("goods drive capability");
    }
}