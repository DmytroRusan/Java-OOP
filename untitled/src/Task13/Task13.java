package Task13;

import java.lang.reflect.Array;
import java.util.*;

public class Task13 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            array.add((int) (Math.random() * 101));
        }
        for (Integer el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
        Set<Integer> uniqueArray = new LinkedHashSet<>(array);
        for (Integer el : uniqueArray) {
            System.out.print(el + " ");
        }

    }
}
