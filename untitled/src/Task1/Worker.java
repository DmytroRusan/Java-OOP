package Task1;

public class Worker {
    String name;
    int money;

    public int earnMoney() {
        int randomNum = (int) (Math.random() * 1001);
        money += randomNum;
        return money;
    }
}
