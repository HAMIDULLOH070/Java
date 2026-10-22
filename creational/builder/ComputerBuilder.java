package creational.builder;

public abstract class ComputerBuilder {
    protected Computer computer;

    public void createComputer() {
        computer = new Computer();
    }

    public abstract void buildRam();
    public abstract void buildOs();
    public abstract void buildStorage();
    public abstract void buildPointingDevice();
    public abstract void buildKeyboard();

    public Computer getComputer() {
        return computer;
    }
}