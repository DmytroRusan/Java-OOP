package Task8;

public class Task8 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ernest Hemingway", 50);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
