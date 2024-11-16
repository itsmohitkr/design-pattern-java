package online.devplanet.Basics.CommandPattern.GoodCode;


public class TurnOffAcCommand implements Command{

    public AirConditioner ac;

    public TurnOffAcCommand(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }
}
