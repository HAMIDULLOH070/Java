package creational.builder;

public class Program {
    public static void main(String[] args) {
        Director director = new Director();

        // 1. Website yaratish namuna
        director.setWebsiteBuilder(new SimpleWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);

        // 2. Computer yaratish namuna
        director.setComputerBuilder(new GamingComputerBuilder());
        Computer computer = director.buildComputer();
        System.out.println(computer.getInfo());
    }
}
