package online.devplanet.Basics.SelfPractice.SOLID;

public class Invoice {

    double price;

    Invoice(double price){
        this.price=price;
    }

    // crate invoice
    public void generateInvoice(){
        System.out.println("invoice is generating");
    }

    // save invoice to db
    public void saveTodb(){
        System.out.println("saving to db");
    }

    public void sendNotification() {
        System.out.println("your invoice is generated");
    }
}
