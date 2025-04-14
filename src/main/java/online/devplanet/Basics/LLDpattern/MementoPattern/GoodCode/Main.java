package online.devplanet.Basics.LLDpattern.MementoPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
        OriginatorTextEditor textEditor =new OriginatorTextEditor();
        Caretaker caretaker= new Caretaker();

        textEditor.write("hello world !");
        caretaker.saveState(textEditor);
        textEditor.write("how are you?");
        caretaker.saveState(textEditor);

        caretaker.undo(textEditor);
        System.out.println(textEditor.getContent());

    }
}
