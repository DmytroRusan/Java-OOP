package Task4;

public class Task4 {
    public static void main(String[] args) {
        ATM atm = new ATM(228332, 10000, 4000, 50);

        atm.addMoneyToATM(5000);
        atm.getMoneyFromATM(1000);
        atm.atmStatus();

        atm.startATM();
        atm.addMoneyToATM(5000);
        atm.getMoneyFromATM(1000);
        atm.atmStatus();
    }
}
