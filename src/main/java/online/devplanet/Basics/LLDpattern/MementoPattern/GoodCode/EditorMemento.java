package online.devplanet.Basics.LLDpattern.MementoPattern.GoodCode;

// memento class - this stores the internal state of the editor object
public class EditorMemento {
    private final String content;

    public EditorMemento(String content){
        this.content=content;
    }

    public String getContent() {
        return content;
    }
}
