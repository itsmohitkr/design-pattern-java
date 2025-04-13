package online.devplanet.Basics.LLDpattern.CommandPattern.GoodCode;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }


}
