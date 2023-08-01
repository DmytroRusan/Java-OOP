package Task8;

public class Person {
    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Мене звати " + fullName + ", мені " + age + " років і я кудись пересуваюся...");
    }

    public void talk() {
        System.out.println("Мене звати " + fullName + ", мені " + age + " років і я щось говорю...");
    }

}
