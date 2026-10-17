package creational.builder;

public class Program {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsite(new SimpleWebsiteBuilder());
        System.out.println(director.buildWebsite());

    }
}
