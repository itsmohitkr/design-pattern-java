package online.devplanet.Basics.SolidPrinciple.DIP.BadCode;

public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}