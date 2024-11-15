package online.devplanet.Basics.SolidPrinciple.OCP.GoodCode;

public class Main {
    public static void main(String [] args){
        PaymentMethod creditCard=new CreditCard();
        PaymentMethod upi=new UPI();
        PaymentProcessor paymentProcessor= new PaymentProcessor();

        paymentProcessor.processPayment(creditCard,200);
        paymentProcessor.processPayment(upi,100);

    }
}
