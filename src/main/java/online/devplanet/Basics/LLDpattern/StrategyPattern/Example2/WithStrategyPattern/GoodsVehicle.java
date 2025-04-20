package online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern;

import online.devplanet.Basics.LLDpattern.StrategyPattern.Example2.WithStrategyPattern.Startegy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
