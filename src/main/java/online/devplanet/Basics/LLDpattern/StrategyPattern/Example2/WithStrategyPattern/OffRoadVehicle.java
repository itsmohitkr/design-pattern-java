package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern;

import online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
