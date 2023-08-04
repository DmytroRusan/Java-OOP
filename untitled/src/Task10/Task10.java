package Task10;

public class Task10 {
    public static void main(String[] args) {
        Phone phone = new Phone("+380501234567");
        MobilePhone mobilePhone = new MobilePhone("+380671234567", 3.4);
        Smartphone smartphone = new Smartphone("+380971234567", 6.8);
        phone.call("+380671234567");
        mobilePhone.sendSMS("+380501234567", "Hello, World!");
        smartphone.makeVideo();
    }
}
