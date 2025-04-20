package online.devplanet.Basics.LLDpattern.AdapterPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.send("mohit", "Test Subject", "Test Body");

        

    }
}
