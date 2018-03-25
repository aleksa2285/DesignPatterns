package turkeys;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble, gobble, gobble");
    }
    @Override
    public void fly() {
        System.out.println("I'm flying a really short distance");
    }
}
