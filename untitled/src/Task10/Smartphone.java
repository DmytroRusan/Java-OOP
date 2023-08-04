package Task10;

public class Smartphone extends MobilePhone {


    public Smartphone(String phoneNumber, double displaySize) {
        super(phoneNumber, displaySize);
    }

    public void makeVideo() {
        System.out.println("Йде запис відео");
    }
}
