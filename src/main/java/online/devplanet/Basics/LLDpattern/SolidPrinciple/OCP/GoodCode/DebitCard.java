package online.devplanet.Basics.LLDpattern.SolidPrinciple.OCP.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via Debit Card " + amount);
    }
}
