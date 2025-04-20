package online.devplanet.Basics.LLDpattern.AdapterPattern.BadCode;

// Legacy code that is not following the Adapter Pattern
public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String to, String subject, String body) {
        // Sending email logic
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

}
