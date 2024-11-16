package online.devplanet.Basics.CommandPattern.GoodCodeWithUndo;


public class TurnAcOnCommand implements Command {

    public AirConditioner ac;

    public TurnAcOnCommand(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {

        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
