package online.devplanet.Basics.OOPS;

public class UPI implements PaymentMethod{
    private String UpiId;

    public UPI(String id){
        this.UpiId=id;
    }

    @Override
    public void pay() {
        System.out.println("paying using UPI" + UpiId);
    }
}
