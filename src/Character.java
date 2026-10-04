public abstract class Character {
    protected Weapon weapon;
    protected String name;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println("--> " + name + " switches their weapon!");
    }

    public abstract void attack(String target);
}
