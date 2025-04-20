package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern;

import online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
