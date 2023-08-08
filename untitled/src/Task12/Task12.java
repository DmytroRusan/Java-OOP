package Task12;

public class Task12 {
    public static void main(String[] args) {
        Human human1 = new Human("Misha", 10);
        Milk milk = new Milk();
        Acid acid = new Acid();
        Beer beer1 = new Beer(0);
        Beer beer2 = new Beer(40);

        milk.drink(30);
        acid.drink(30);
        beer1.drink(30);
        beer2.drink(30);
    }
}
