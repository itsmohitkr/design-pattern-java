package online.devplanet.Basics.SolidPrinciple.DIP.BadCode;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}