package creational.factory;

public interface DeveloperFactory {

    Developer createDeveloper();

    static Developer createDeveloper(String specialty) {
        if (specialty == null) {
            throw new IllegalArgumentException("Mutaxassislik bo'sh bo'lishi mumkin emas!");
        }

        return switch (specialty.toLowerCase()) {
            case "cpp" -> new CppDeveloper();
            case "python" -> new PythonDeveloper();
            default -> throw new IllegalArgumentException("Noma'lum mutaxassislik: " + specialty);
        };
    }
}
