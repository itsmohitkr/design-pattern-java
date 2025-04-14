package online.devplanet.Basics.InterviewQuestion.LLDchainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor errorProcessor = new ErrorLogProcessor(null);
        LogProcessor debugLogProcessor = new DebugLogProcessor(errorProcessor);
        LogProcessor infoProcessor = new InfoLogProcessor(debugLogProcessor);

        infoProcessor.processLog(LogProcessor.INFO, "This is an info message.");
        infoProcessor.processLog(LogProcessor.DEBUG, "This is a warning message.");
        infoProcessor.processLog(LogProcessor.ERROR, "This is an error message.");
    }
}
