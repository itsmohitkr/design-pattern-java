package online.devplanet.Basics.LLDpattern.AdapterPattern.BadCode;

public class SendGridService {
    public void send(String recipients, String title, String content) {
        System.out.println("Sending email using SendGrid: " + recipients);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}
