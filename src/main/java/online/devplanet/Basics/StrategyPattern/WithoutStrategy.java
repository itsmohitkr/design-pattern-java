package online.devplanet.Basics.StrategyPattern;

class PaymentService{

    public void processPayment(String paymentMethod){

        if (paymentMethod.equals("credit card")){
            System.out.println("payment made via credit card");
        }

        else if (paymentMethod.equals("debit card")){
            System.out.println("payment made via debit card");
        }

        else if (paymentMethod.equals("UPI")){
            // logic could be huge
            System.out.println("payment made via UPI");
        }

        else{
            System.out.println("Unsupported Payment method");
        }

    }
}

public class WithoutStrategy {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("credit card");
        paymentService.processPayment("debit card");
        paymentService.processPayment("UPI");

    }
}