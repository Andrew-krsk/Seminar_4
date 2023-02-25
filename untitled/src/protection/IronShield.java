package protection;

public class IronShield implements Shield{
    @Override
    public int guard() {
        return 80;
    }

    @Override
    public String toString() {
        return "Iron shield= " + guard();
    }
}
