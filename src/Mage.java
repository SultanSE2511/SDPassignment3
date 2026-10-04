public class Mage extends Character {
    public Mage(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    public void attack(String target) {
        System.out.print("Mage " + name + " casts a spell through weapon: ");
        int mageBaseDamage = 15;
        weapon.applyDamage(target, mageBaseDamage);
    }
}