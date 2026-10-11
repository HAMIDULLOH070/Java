package creational.facade;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory cppDeveloperFactory = getDeveloperFactory("Python");
        Developer developer = cppDeveloperFactory.createDeveloper();
        developer.writeCode();
        DeveloperFactory pythonDeveloperFactory = getDeveloperFactory("C++");
        Developer developer2 = pythonDeveloperFactory.createDeveloper();
        developer2.writeCode();
    }

    private static DeveloperFactory getDeveloperFactory(String language) {
        if (language.equals("C++")) {
            return new CppDeveloperFactory();
        } else if (language.equals("Python")) {
            return new PythonDeveloperFactory();
        } else
            throw new RuntimeException();
    }

}
