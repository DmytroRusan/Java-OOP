package Task7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Телефонує " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Телефонує: " + name + "; номер: " + number);
    }


    public String toString() {
        return " Номер телефону: " + number + "; модель телефону: " + model + "; вага телефону: " + weight;
    }
}
