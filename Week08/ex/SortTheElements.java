import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("apple");
        list.add("banana");
        list.add("zebra");
        list.add("dog");
        System.out.println("Original list: " + list);

        Collections.sort(list);
        System.out.println("Sorted list using Collections.sort(): " + list);

        list.sort(null);
        System.out.println("Sorted list using List.sort(): " + list);

        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        Collections.sort(list, comparator1);
        System.out.println("Sorted list using anonymous class: " + list);

        Comparator<String> comparator2 = new MyStringComparator();
        Collections.sort(list, comparator2);
        System.out.println("Sorted list using concrete class: " + list);
    }

    static class MyStringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}
