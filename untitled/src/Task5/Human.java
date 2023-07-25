package Task5;

public class Human {
    private String name;
    private int age;
    private String gender;
    private double weight;

    public Human(String name, int age, String gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age > this.age) {
            this.age = age;
        } else {
            System.out.println("Вік не може бути нулем, менше нуля або меншим за поточний вік");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Вага не може бути нулем, або менше нуля");
        }
    }


}
