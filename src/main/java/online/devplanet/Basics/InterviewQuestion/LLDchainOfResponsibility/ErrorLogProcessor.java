package online.devplanet.Basics.InterviewQuestion.LLDchainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void processLog(int level, String message) {
        if (level == ERROR) {
            System.out.println("Error: " + message);
        } else {
            super.processLog(level, message);
        }
    }
}
