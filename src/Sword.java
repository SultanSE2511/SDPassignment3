public class Sword implements Weapon {
    @Override
    public void applyDamage(String target, int baseDamage) {
        int totalDamage = baseDamage + 15;
        System.out.println("slashes " + target + " with a sword, dealing " + totalDamage + " physical damage!");
    }
}