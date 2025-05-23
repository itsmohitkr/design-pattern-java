package online.devplanet.Basics.LLDpattern.MementoPattern.GoodCode;

import java.util.Stack;

public class Caretaker {
    public final Stack<EditorMemento> history=new Stack<>();

    public void saveState(OriginatorTextEditor editor){
        history.push(editor.save());
    }

    public void undo(OriginatorTextEditor editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
