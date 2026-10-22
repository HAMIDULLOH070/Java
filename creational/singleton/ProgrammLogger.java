package creational.singleton;

public class ProgrammLogger {
    private String logFile = "This is log file. \n";

    // Tashqi sinfdan obyekt yaratib bo'lmasligi uchun private konstruktor
    private ProgrammLogger() {}

    // Bill Pugh Singleton usuli (Static Inner Class Holder)
    private static class Holder {
        private static final ProgrammLogger INSTANCE = new ProgrammLogger();
    }

    public static ProgrammLogger getProgrammLogger() {
        return Holder.INSTANCE;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
