package Task10;

public class MobilePhone extends Phone {
    private double displaySize;

    public MobilePhone(String phoneNumber, double displaySize) {
        super(phoneNumber);
        this.displaySize = displaySize;

    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void sendSMS(String phone, String smsText) {
        System.out.println("Ваше повідомлення було успішно відправлено");
    }
}
