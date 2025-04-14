package online.devplanet.Basics.InterviewQuestion.LLDchainOfResponsibility;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    LogProcessor nextProcessor;

    public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
    public void processLog(int level, String message) {
        if (nextProcessor != null) {
            nextProcessor.processLog(level, message);
        }
    }
}
