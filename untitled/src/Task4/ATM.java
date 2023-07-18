package Task4;

public class ATM {
    private int ID;
    private int currentMoney;
    private int maxMoneyToGet;
    private int minMoneyToGet;
    private boolean isOn;

    public ATM(int ID, int currentMoney, int maxMoneyToGet, int minMoneyToGet) {
        this.ID = ID;
        this.currentMoney = currentMoney;
        this.maxMoneyToGet = maxMoneyToGet;
        this.minMoneyToGet = minMoneyToGet;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void startATM() {
        isOn = true;
        System.out.println("ATM почав свою роботу");
    }

    public void addMoneyToATM(int money) {
        if (isOn) {
            currentMoney += money;
            System.out.println("На рахунок банкомата було покладено " + money + " грн.");
        } else {
            System.out.println("Операція неможлива, банкомат вимкнений");
        }

    }

    public void getMoneyFromATM(int money) {
        if (isOn) {
            if (money >= minMoneyToGet && money <= maxMoneyToGet) {
                currentMoney -= money;
                System.out.println("Операція успішна, отримайте ваші " + money + " грн.");
            } else if (money < minMoneyToGet) {
                System.out.println("Неможливо зняти суму менше " + minMoneyToGet + " грн.");
            } else if (money > maxMoneyToGet) {
                System.out.println("Неможливо зняти суму більше за " + +maxMoneyToGet + " грн.");
            }
        } else {
            System.out.println("Операція неможлива, банкомат вимкнений");
        }
    }

    public void atmStatus() {
        System.out.println("Банкомат № " + ID + " має на рахунку: " + currentMoney + " грн.");
    }

}
