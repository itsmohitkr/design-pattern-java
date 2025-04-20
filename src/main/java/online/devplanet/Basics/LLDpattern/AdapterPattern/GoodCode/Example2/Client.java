package online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example2;

public class Client {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.send("mohit", "Test Subject", "Test Body");

        NotificationService newSendGridNotificationService = new SendGridAdapterService(new SendGridService());

        newSendGridNotificationService.send("mohit", "Test Subject", "Test Body");
        // You can easily switch to a different notification service without changing the client code
    }
}
