package online.devplanet.Basics.LLDpattern.MementoPattern.BadCode;

import java.util.Stack;

public class Editor {
    private Stack<String>s= new Stack<>();


    public String getContent() {
            return s.peek();
    }

    public void write(String content) {
        s.push(content);
    }


    public void undo(){
        if(!s.isEmpty()){
            s.pop();
        }
    }
}
