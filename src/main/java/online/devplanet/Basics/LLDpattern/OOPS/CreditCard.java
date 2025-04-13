package online.devplanet.Basics.LLDpattern.OOPS;

public class CreditCard extends Card{

    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("making payment using creditcard");
    }
}
