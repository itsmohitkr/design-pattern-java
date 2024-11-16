package online.devplanet.Basics.CommandPattern.GoodCode;

import online.devplanet.Basics.CommandPattern.GoodCode.AirConditioner;

public class TurnAcOnCommand implements Command{

    public AirConditioner ac;

    public TurnAcOnCommand(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }
}
