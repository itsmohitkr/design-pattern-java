package online.devplanet.Basics.MementoPattern;

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
