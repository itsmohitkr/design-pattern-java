package online.devplanet.Basics.LLDpattern.MementoPattern.GoodCode;

public class OriginatorTextEditor {
    private String content;

    public void write(String content){
        this.content=content;
    }

    // save the current state of the editor
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        content=memento.getContent();
    }

    public String getContent() {
        return content;
    }


}
