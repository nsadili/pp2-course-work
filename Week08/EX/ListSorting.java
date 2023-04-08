import java.util.*;

public class ListSorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "orange", "banana", "kiwi"));
        System.out.println("Original list: " + list);

        System.out.println("i. Try Collections.sort() method");
        Collections.sort(list);
        System.out.println("Sorted with Collections.sort(): " + list);

        System.out.println("ii. Try List.sort() method");
        list.sort(null);
        System.out.println("Sorted with List.sort(): " + list);

        System.out.println("1. Create instance of an anonymous class");
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Collections.sort(list, lengthComparator);
        System.out.println("Sorted with Comparator interface and anonymous class: " + list);

        System.out.println("2. Create a concrete class implementing Comparator and use its instance");
        class ReverseAlphabeticalComparator implements Comparator<String> {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        }
        list.sort(new ReverseAlphabeticalComparator());
        System.out.println("Sorted with Comparator interface and concrete class: " + list);
    }
}
