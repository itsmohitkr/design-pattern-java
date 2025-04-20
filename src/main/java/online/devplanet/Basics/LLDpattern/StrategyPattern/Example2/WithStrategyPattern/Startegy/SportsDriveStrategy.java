package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
