package creational.prototype;

public class GameRunner {
    public static void main(String[] args) {
        GameCharacter original = new GameCharacter(1, "Warrior", 10, "Sword");
        System.out.println("Original: " + original);

        CharacterFactory factory = new CharacterFactory(original);

        GameCharacter clone1 = factory.cloneCharacter();
        GameCharacter clone2 = factory.cloneCharacter();

        clone1.setName("Knight");
        clone1.setLevel(15);
        clone1.setWeapon("Axes");

        clone2.setName("Paladin");
        clone2.setLevel(20);
        clone2.setWeapon("Hammer");

        System.out.println("Clone 1:  " + clone1);
        System.out.println("Clone 2:  " + clone2);
        System.out.println("Original (o'zgarmaganligi tekshirilmoqda): " + original);
        System.out.println("original == clone1: " + (original == clone1));
    }
}
