package items;

import protection.IronShield;
import weapons.Sword;

public class SwordMan extends Warrior<Sword, IronShield> {
    public SwordMan(String name, Sword weapon, IronShield shield) {
        super(name, weapon, shield);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
