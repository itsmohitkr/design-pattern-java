package online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example2;

public class SendGridAdapterService implements NotificationService {
    private final SendGridService sendGridService;

    public SendGridAdapterService(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }
    @Override
    public void send(String to, String subject, String body) {
       sendGridService.send(to, subject, body);
    }
}
