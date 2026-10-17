package creational.singleton;

public class ProgrammLogger {
    private static ProgrammLogger programmLogger;
    private static String logFile = "This is log file. \n";

    public static synchronized ProgrammLogger getProgrammLogger() {
        if (programmLogger == null) {
            programmLogger = new ProgrammLogger();
        }
        return programmLogger;
    }

    private ProgrammLogger() {
    }

    public void addLogInfo(String info) {
        logFile += info + "\n";
    }

    public void showLogInfo() {
        System.out.println(logFile);
    }

}

