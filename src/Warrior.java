public class Warrior extends Character {
    public Warrior(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    public void attack(String target) {
        System.out.print("Warrior " + name + " fiercely attacks: ");
        int warriorBaseDamage = 30;
        weapon.applyDamage(target, warriorBaseDamage);
    }
}
