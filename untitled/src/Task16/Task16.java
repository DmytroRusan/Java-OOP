package Task16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task16 {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 51));
        }
        System.out.println(list);
        System.out.println(reverse(list));
    }

    public static List<Integer> reverse(Set<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (Integer el : list) {
            reversedList.add(0, el);
        }
        return reversedList;
    }
}
