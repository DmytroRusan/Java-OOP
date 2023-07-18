package Task2;

public class Task2 {
    public static void main(String[] args) {
        Car car = new Car("AB1234AB", "black", 5);
        car.printNumber();
        car.changeHumanCount();
        System.out.println(car.getHumanCount());
        car.changeState();
        car.changeState();
        car.changeState();

    }
}
