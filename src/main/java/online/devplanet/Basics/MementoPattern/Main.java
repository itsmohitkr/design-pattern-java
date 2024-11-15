package online.devplanet.Basics.MementoPattern;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor =new TextEditor();
        Caretaker caretaker= new Caretaker();

        textEditor.write("hello world !");
        caretaker.saveState(textEditor);
        textEditor.write("how are you?");
        caretaker.saveState(textEditor);

        caretaker.undo(textEditor);


    }
}
