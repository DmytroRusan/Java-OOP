package Task15;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 41 - 20));
        }
        System.out.println(list);
        int finalResult = numberOfOccurrences(list, 5);
        if (finalResult > 0) {
            System.out.println("Кількість входжень в масив: " + finalResult);
        } else {
            System.out.println("Кількість входжень в масив: 0");
        }
    }

    public static int numberOfOccurrences(List<Integer> list, int number) {
        int counter = 0;
        for (Integer el : list) {
            if (el == number) {
                counter++;
            }
        }
        return counter;
    }
}
