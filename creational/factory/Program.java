package creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory cppDeveloperFactory = getDeveloperFactory("C++");
        Developer developer = cppDeveloperFactory.createDeveloper();
        developer.writeCode();
        DeveloperFactory pythonDeveloperFactory = getDeveloperFactory("Python");
        Developer developer2 = pythonDeveloperFactory.createDeveloper();
        developer2.writeCode();
    }

    private static DeveloperFactory getDeveloperFactory(String language) {
        if ("C++".equalsIgnoreCase(language)) {
            return new CppDeveloperFactory();
        } else if ("Python".equalsIgnoreCase(language)) {
            return new PythonDeveloperFactory();
        }
        throw new IllegalArgumentException("Noma'lum dasturlash tili: " + language);
    }
}
