package Task14;

import java.util.ArrayList;
import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add((int) (Math.random() * 67 - 33));

        }
        System.out.println(list);
        System.out.println(lower(-29, list));

    }

    public static List<Integer> lower(int num, List<Integer> list) {
        List<Integer> finalList = new ArrayList<>();
        for (Integer el : list) {
            if (el < num) {
                finalList.add(el);
            }
        }
        return finalList;
    }
}
