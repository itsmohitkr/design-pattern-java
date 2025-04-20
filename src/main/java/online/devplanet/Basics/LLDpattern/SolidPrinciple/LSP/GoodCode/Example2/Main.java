package online.devplanet.Basics.LLDpattern.SolidPrinciple.LSP.GoodCode.Example2;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        bird.makeSound();

        FlyingBird flyingBird= new Sparrow();
        flyingBird.makeSound();
        flyingBird.fly();

    }
}
