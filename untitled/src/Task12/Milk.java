package Task12;

public class Milk extends Liquid {
    public Milk() {
        super(0);
    }

    @Override
    public void drink(int age) {
        System.out.println("Пийте молочко на здоров'я");
    }

    @Override
    public boolean canBeDrunk(int age) {
        return true;
    }
}
