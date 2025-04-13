package online.devplanet.Basics.LLDpattern.StrategyPattern;

// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// ConcreteStrategyA
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card " + cardNumber);
    }
}

// ConcreteStrategyB
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + email);
    }
}

// Context
class PaymentContext {
    private PaymentStrategy strategy;

    // Setting a strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(int amount) {
        strategy.pay(amount); // Delegates payment to the current strategy
    }
}

public class WithStrategyPattern {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.processPayment(500);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("myemail@example.com"));
        context.processPayment(750);

    }
}
