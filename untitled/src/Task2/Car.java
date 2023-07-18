package Task2;

public class Car {
    private String number;
    private String color;
    private int humanCount;
    private int maxHumanCount;
    private boolean state; //false - off; true - on;


    public Car(String number, String color, int maxHumanCount) {
        this.number = number;
        this.color = color;
        if (maxHumanCount > 0) {
            this.maxHumanCount = maxHumanCount;
        } else {
            System.out.println("Максимальна кількість людей не може бути нулем або менше нуля");
        }

    }

    public int getHumanCount() {
        return humanCount;
    }

    public void printNumber() {
        System.out.println("Номер автомобіля - " + number + "\n Колір автомобіля - " + color +
                "\n Кількість людей в автомобілі - " + humanCount);
    }

    public void changeHumanCount() {
        int randomNum = (int) (Math.random() * 11 - 5);
        int total = humanCount + randomNum;
        if (total >= 0 && total <= maxHumanCount) {
            humanCount = total;
            System.out.println("Люди в кількості " + randomNum + " зайшли/вийшли");
        } else {
            System.out.println("Така кількість людей не може зайти/вийти");
        }
    }

    public void changeState() {
        if (state) {
            state = false;
            System.out.println("Двигун вимкнено");
        } else {
            state = true;
            System.out.println("Двигун увімкнено");
        }
    }


}
