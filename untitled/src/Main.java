import items.Archer;
import items.SwordMan;
import items.Warrior;
import protection.EmptyShield;
import protection.IronShield;
import protection.WoodenShield;
import team.Team;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Vasya", new Bow(), new WoodenShield()))
                .addWarrior(new Archer("Petya", new Bow(), new WoodenShield()))
                .addWarrior(new Archer("Misha", new Bow(), new WoodenShield()))
                .addWarrior(new Archer("Grisha", new Bow(), new WoodenShield()));

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasya", new Bow(), new WoodenShield()))
                .addWarrior(new SwordMan("Petya", new Sword(), new IronShield()))
                .addWarrior(new Archer("Misha", new Bow(), new WoodenShield()))
                .addWarrior(new SwordMan("Grisha", new Sword(), new IronShield()));

        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Petya", new Sword(), new IronShield());
        Archer misha = new Archer("Misha", new Bow(), new WoodenShield());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            int damage2 = misha.hitDamage(greg);
            int damage1 = greg.hitDamage(misha);
            System.out.printf("Griha Health: %d Misha Health: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
        }

        if (greg.getHealthPoint()>0)
            System.out.println("Griha won");
        else
            System.out.println("Misha won");
    }
}