package Task12;

public class Acid extends Liquid {
    public Acid() {
        super(0);
    }

    @Override
    public void drink(int age) {
        System.out.println("Кислоту пити не можна!");
    }

    @Override
    public boolean canBeDrunk(int age) {
        return false;
    }
}
