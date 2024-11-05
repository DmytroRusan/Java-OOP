package Task19;

import java.util.ArrayList;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 101));
        }
        System.out.println(list);
        shuffle(list, 10);
        System.out.println(list);
    }

    public static void shuffle(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            int index1 = (int) (Math.random() * list.size());
            int index2 = (int) (Math.random() * list.size());
            Integer element1 = list.get(index1);
            Integer element2 = list.get(index2);
            list.set(index1, element2);
            list.set(index2, element1);
        }
    }
}
