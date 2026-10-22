package creational.singleton;

public class Program {
    public static void main(String[] args) {
        ProgrammLogger logger = ProgrammLogger.getProgrammLogger();
        logger.addLogInfo("Application started");
        logger.addLogInfo("Application finished");
        logger.showLogFile();
    }
}