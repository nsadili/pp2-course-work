import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortExample {
    public static void main(String[] args) {
        // Create a list of unsorted integers
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        Collections.sort(list);
        System.out.println("Sorted list using Collections.sort(): " + list);

        list.sort(null);
        System.out.println("Sorted list using List.sort(): " + list);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, comparator);
        System.out.println("Sorted list using Comparator interface with an anonymous class: " + list);

        class MyComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
        Comparator<Integer> myComparator = new MyComparator();
        Collections.sort(list, myComparator);
        System.out.println("Sorted list using a concrete class implementing Comparator interface: " + list);
    }
}
