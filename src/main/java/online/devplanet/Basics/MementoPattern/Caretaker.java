package online.devplanet.Basics.MementoPattern;

import java.util.Stack;

public class Caretaker {
    public final Stack<EditorMemento> history=new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
