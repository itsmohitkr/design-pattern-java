package online.devplanet.Basics.LLDpattern.MementoPattern.BadCode;

public class Main {
    public static void main(String[] args) {
        Editor editor= new Editor();
        editor.write("hello world");
        editor.write("hello mohan");

        editor.write("hello duniya");

//        System.out.printf(editor.getContent());

        editor.undo();
        editor.write("sdfsdfsd");
        editor.undo();
        System.out.printf(editor.getContent());


    }
}
