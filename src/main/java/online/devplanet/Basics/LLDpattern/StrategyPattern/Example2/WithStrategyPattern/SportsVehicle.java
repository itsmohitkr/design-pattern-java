package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern;

import online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy.DriveStrategy;
import online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{


    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
