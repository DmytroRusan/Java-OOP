package Task17;

import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add((int) (Math.random() * 31 + 10));
            list2.add((int) (Math.random() * 31 + 10));
        }
        System.out.println(list1);
        System.out.println(list2);

        Set<Integer> finalList = new LinkedHashSet<>();
        for (Integer el : list1) {
            if (list2.contains(el)) {
                finalList.add(el);
            }
        }
        System.out.println(finalList);
    }
}
