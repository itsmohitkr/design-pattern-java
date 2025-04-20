package online.devplanet.Basics.LLDpattern.SolidPrinciple.LSP.GoodCode.Example2;

public class Sparrow implements FlyingBird{

    @Override
    public void fly() {
        System.out.println("sparrow can fly");
    }

    @Override
    public void makeSound() {
        System.out.println("sparrow can make sound to");
    }
}
