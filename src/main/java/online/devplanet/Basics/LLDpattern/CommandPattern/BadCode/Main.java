package online.devplanet.Basics.LLDpattern.CommandPattern.BadCode;

public class Main {
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl(ac);

        remote.pressOnButton();
        remote.pressOffButton();
        remote.setTemp(22);

    }
}
