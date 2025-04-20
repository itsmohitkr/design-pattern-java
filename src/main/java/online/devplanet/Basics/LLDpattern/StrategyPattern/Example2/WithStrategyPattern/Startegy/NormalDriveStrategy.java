package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
