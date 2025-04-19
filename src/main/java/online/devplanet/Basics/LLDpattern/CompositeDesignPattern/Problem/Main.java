package online.devplanet.Basics.LLDpattern.CompositeDesignPattern.Problem;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        File border= new File("Border");
        movieDirectory.add(border);
        Directory actionDirectory = new Directory("Action");
        File fastAndFurious = new File("fastAndFurious");
        actionDirectory.add(fastAndFurious);

        movieDirectory.ls();
    }
}
