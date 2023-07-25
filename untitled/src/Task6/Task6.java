package Task6;

public class Task6 {
    public static void main(String[] args) {
        Human human = new Human("Erik", 24, 185, 82.5);
        System.out.println(human.getCoefficient());

        Soldier soldier1 = new Soldier("Sam", 21, 191, 89.9, false);
        Soldier soldier2 = new Soldier("Henry", 18, 177, 83, true);
        System.out.println(soldier1.getCoefficient());
        System.out.println(soldier2.getCoefficient());

    }
}
