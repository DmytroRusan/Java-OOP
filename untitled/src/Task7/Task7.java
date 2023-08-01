package Task7;

public class Task7 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380671020300", "Apple iPhone 14 Pro Max", 240);
        Phone phone2 = new Phone("+380501020400", "Samsung Galaxy S23 Ultra", 320);
        Phone phone3 = new Phone("+380971020500", "Nokia 3310", 2000);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("John");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Anna");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Andrew");
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Helga", "+380500000001");
        phone2.receiveCall("Misha", "+380500000002");
        phone3.receiveCall("Grisha", "+380500000003");
    }
}
