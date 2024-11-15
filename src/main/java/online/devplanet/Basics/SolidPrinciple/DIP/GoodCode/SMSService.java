package online.devplanet.Basics.SolidPrinciple.DIP.GoodCode;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("sending message "+ msg);
    }
}
