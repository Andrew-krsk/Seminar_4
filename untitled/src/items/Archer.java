package items;

import protection.IronShield;
import protection.WoodenShield;
import weapons.Bow;

public class Archer extends Warrior<Bow, WoodenShield> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, WoodenShield shield) {
        super(name, weapon, shield);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}
