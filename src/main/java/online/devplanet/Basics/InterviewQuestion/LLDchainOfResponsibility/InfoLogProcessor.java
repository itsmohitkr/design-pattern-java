package online.devplanet.Basics.InterviewQuestion.LLDchainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void processLog(int level, String message) {
        if (level == INFO) {
            System.out.println("Info: " + message);
        } else {
            super.processLog(level, message);
        }
    }
}
