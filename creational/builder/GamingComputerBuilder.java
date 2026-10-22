package creational.builder;

public class GamingComputerBuilder extends ComputerBuilder {

    @Override
    public void buildRam() {
        computer.setRam("32GB DDR5");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 11 Pro");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2TB NVMe SSD");
    }

    @Override
    public void buildPointingDevice() {
        computer.setPointingDevice("Gaming Mouse");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("Mechanical RGB Keyboard");
    }
}