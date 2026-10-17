package creational.builder;

public class SimpleWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Simple Website Builder");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.TILDA);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
