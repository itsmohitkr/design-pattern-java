package online.devplanet.Basics.SelfPractice.SOLID;

public class ViaDebit implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("paying dc");
    }
}

