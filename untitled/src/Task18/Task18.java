package Task18;

import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Орест");
        names.add("Ярослав");
        names.add("Анна");
        names.add("Самсон");
        names.add("Богдан");
        names.add("Анастасія");
        names.add("Анна");
        names.add("Олег");
        names.add("Данило");
        names.add("Олег");
        names.add("Антон");
        System.out.println(names);
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println(uniqueNames);
        List<String> finalList = new ArrayList<>(uniqueNames);
        Collections.sort(finalList);
        System.out.println(finalList);
    }
}
