package online.devplanet.Basics.LLDpattern.CommandPattern.GoodCode;

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
