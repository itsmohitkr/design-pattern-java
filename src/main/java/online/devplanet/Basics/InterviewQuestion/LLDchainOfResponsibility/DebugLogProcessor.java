package online.devplanet.Basics.InterviewQuestion.LLDchainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void processLog(int level, String message) {
        if (level == DEBUG) {
            System.out.println("Debug: " + message);
        } else {
            super.processLog(level, message);
        }
    }
}
