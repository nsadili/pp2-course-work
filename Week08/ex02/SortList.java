package Week08.ex02;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list);
        System.out.println("Sorted using Collections.sort(): " + list);

        list.sort(null);
        System.out.println("Sorted using List.sort(): " + list);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, comparator);
        System.out.println("Sorted using Comparator (anonymous class): " + list);

        class MyComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
        MyComparator myComparator = new MyComparator();
        list.sort(myComparator);
        System.out.println("Sorted using Comparator (concrete class): " + list);
    }
}

