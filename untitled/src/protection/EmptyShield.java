package protection;

public class EmptyShield implements Shield{
    @Override
    public int guard() {
        return 0;
    }

    @Override
    public String toString() {
        return "Empty shield= " + guard();
    }
}
