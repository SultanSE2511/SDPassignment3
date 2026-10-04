public class Main {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        Weapon bow = new Bow();

        Character warrior = new Warrior("Conan", sword);
        warrior.attack("Goblin");

        Character mage = new Mage("Gandalf", bow);
        mage.attack("Orc");

        System.out.println("----------------------------------------");

        warrior.setWeapon(bow);
        warrior.attack("Dragon");
    }
}