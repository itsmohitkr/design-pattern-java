package online.devplanet.Basics.LLDpattern.CommandPattern.GoodCodeWithUndo;

import java.util.Stack;

public class RemoteControl {

    public Stack<Command> commandHistory = new Stack<>();

    Command command;


    public void setCommand(Command command) {

        this.command = command;

    }

    public void pressButton(){

        command.execute();
        commandHistory.add(command);
    }

    public void undoMethod(){
        if(!commandHistory.isEmpty()){
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

}
