package Task12;

public class Beer extends Liquid {
    public Beer(double alcoholByVolume) {
        super(alcoholByVolume);
    }

    @Override
    public void drink(int age) {
        if (canBeDrunk(age)) {
            System.out.println("Ви можете пити пиво");
        } else {
            System.out.println("Вам заборонено пити пиво");
        }
    }

    @Override
    public boolean canBeDrunk(int age) {
        return age > 18 || !isAlcohol();
    }
}
