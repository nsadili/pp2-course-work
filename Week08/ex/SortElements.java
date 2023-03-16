package Week08.ex;

import java.util.*;

class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2) return -1;
        return 1;
    }
}

public class SortElements {
    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<Integer>();
        Collections.addAll(intList1, 1, 6, 3, 2, 5, 7, 3, 9, 0, 7, 8, 4);

        List<Integer> intList2 = new ArrayList<Integer>(intList1);
        List<Integer> intList3 = new ArrayList<Integer>(intList1);

        Collections.sort(intList1);
        System.out.println(intList1);

        intList2.sort(new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                if (i1 < i2) return -1;
                return 1;
            }
        });

        System.out.println(intList2);

        intList3.sort(new IntegerComparator());

        System.out.println(intList3);
    }
}
