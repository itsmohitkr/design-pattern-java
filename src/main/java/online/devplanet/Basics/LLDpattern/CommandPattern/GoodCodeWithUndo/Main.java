package online.devplanet.Basics.LLDpattern.CommandPattern.GoodCodeWithUndo;



public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        AirConditioner ac = new AirConditioner();

        remote.setCommand(new TurnAcOnCommand(ac));
        remote.setCommand(new TurnOffAcCommand(ac));

        remote.pressButton();
        remote.undoMethod();


    }
}
