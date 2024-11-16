package online.devplanet.Basics.CommandPattern.GoodCode;

import online.devplanet.Basics.CommandPattern.GoodCode.RemoteControl;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnAcOnCommand(ac));
        remote.setCommand(new TurnOffAcCommand(ac));

        remote.pressButton();


    }
}
