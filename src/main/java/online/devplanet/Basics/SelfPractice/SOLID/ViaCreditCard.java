package online.devplanet.Basics.SelfPractice.SOLID;

public class ViaCreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("paying cc");
    }
}
