package online.devplanet.Basics.SelfPractice.SOLID;

public class PaymentProcessor {
    PaymentMethod paymentMethod;

    PaymentProcessor(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public void processPayment(double amount){
        paymentMethod.pay(amount);
    }

}
