public class Bow implements Weapon {
    @Override
    public void applyDamage(String target, int baseDamage) {
        int totalDamage = baseDamage + 10;
        System.out.println("shoots an arrow at " + target + " from afar, dealing " + totalDamage + " ranged damage!");
    }
}
