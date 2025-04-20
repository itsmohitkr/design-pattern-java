package online.devplanet.Basics.LLDpattern.CommandPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnAcOnCommand(ac));
        remote.setCommand(new TurnOffAcCommand(ac));

        remote.pressButton();
    }
}
