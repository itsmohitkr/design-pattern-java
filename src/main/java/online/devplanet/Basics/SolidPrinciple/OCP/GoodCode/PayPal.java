package online.devplanet.Basics.SolidPrinciple.OCP.GoodCode;

public class PayPal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via PayPal");
    }
}