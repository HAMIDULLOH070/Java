package creational.singleton;

public class Programm {
    public static void main(String[] args) {
        ProgrammLogger programmLogger = ProgrammLogger.getProgrammLogger();
        programmLogger.addLogInfo("Starting math processing");
        programmLogger.addLogInfo("Math processing success");
        programmLogger.showLogInfo();


        ProgrammLogger programmLogger2 = ProgrammLogger.getProgrammLogger();
        programmLogger2.showLogInfo();

        System.out.println(programmLogger.equals(programmLogger2));
    }
}
