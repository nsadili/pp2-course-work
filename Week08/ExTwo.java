package Week08;

import java.util.*;

public class ExTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(0);

        // Try Collections.sort() method
        Collections.sort(list);
        System.out.println(list.toString());

        // Try List.sort() method
        list.sort(null);
        System.out.println(list);

        // Try Comparator interface

        // Anonymous class
        Comparator<Integer> acomparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, acomparator);

        // Concrete class
        AComparator comparator = new AComparator();
        Collections.sort(list, comparator);

        System.out.println(list);

    }
}

class AComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}