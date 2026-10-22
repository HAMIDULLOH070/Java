package creational.builder;

public class Director {
    private WebsiteBuilder websiteBuilder;
    private ComputerBuilder computerBuilder;

    // Website qurish uchun
    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildWebsite() {
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();
        return websiteBuilder.getWebsite();
    }

    // Computer qurish uchun
    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer() {
        computerBuilder.createComputer();
        computerBuilder.buildRam();
        computerBuilder.buildOs();
        computerBuilder.buildStorage();
        computerBuilder.buildPointingDevice();
        computerBuilder.buildKeyboard();
        return computerBuilder.getComputer();
    }
}
