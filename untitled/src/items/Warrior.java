package items;

import protection.Shield;
import weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon, E extends Shield> {
    private String name;
    protected T weapon;
    protected E shield;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T weapon, E shield) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        healthPoint = 100 + shield.guard();
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage() - shield.guard();
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", guard=" + shield +
                ", healthPoint=" + healthPoint +
                '}';
    }
}
