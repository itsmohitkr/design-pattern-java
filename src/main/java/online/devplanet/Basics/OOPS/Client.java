package online.devplanet.Basics.OOPS;

public class Client {
   public static void main(String[] args) {
      PaymentService ps = new PaymentService();
      ps.addPaymentMethod("myCreditCard", new CreditCard("1234", "Mohit Kumar"));
      ps.addPaymentMethod("myDebitCard", new DebitCard("87687", "Mohit Kumar verma"));
      ps.addPaymentMethod("myupiId", new UPI("mohkumar@12234"));
      ps.addPaymentMethod("myWallet", new Wallet());

      ps.makePayment("myWallet");
   }
}