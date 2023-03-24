package Week08;

import java.util.*;

public class SortingElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(1);

        Collections.sort(list);
        System.out.println(list.toString());

        list.sort(null);
        System.out.println(list);


        Comparator<Integer> acomparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, acomparator);

        
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