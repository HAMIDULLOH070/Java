package creational.builder;

public class Computer {
    private String ram;
    private String os;
    private String storage;        // ssd/hdd
    private String pointingDevice; // mouse/touchPad
    private String keyboard;

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setPointingDevice(String pointingDevice) {
        this.pointingDevice = pointingDevice;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    // Doskada ko'rsatilgan getInfo metodi
    public String getInfo() {
        return "Computer{" +
                "RAM='" + ram + '\'' +
                ", OS='" + os + '\'' +
                ", Storage='" + storage + '\'' +
                ", PointingDevice='" + pointingDevice + '\'' +
                ", Keyboard='" + keyboard + '\'' +
                '}';
    }
}