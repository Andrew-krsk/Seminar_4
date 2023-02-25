package protection;

public class WoodenShield implements Shield {

    @Override
    public int guard() {
        return 50;
    }

    @Override
    public String toString() {
        return "Guard shield= " + guard();
    }
}
