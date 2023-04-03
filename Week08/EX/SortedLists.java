import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedLists {
    public static void main(String[] args) {
        // create a list of unsorted Strings
        List<String> unsortedList = new ArrayList<String>();
        unsortedList.add("banana");
        unsortedList.add("apple");
        unsortedList.add("cherry");
        unsortedList.add("grape");
        unsortedList.add("kiwi");

        // sort the list using Collections.sort()
        Collections.sort(unsortedList);
        System.out.println("Sorted List using Collections.sort(): " + unsortedList);

        // create a new list of unsorted Strings
        List<String> unsortedList2 = new ArrayList<String>();
        unsortedList2.add("banana");
        unsortedList2.add("apple");
        unsortedList2.add("cherry");
        unsortedList2.add("grape");
        unsortedList2.add("kiwi");

        // sort the list using List.sort()
        unsortedList2.sort(null);
        System.out.println("Sorted List using List.sort(): " + unsortedList2);

        // create a new list of unsorted Strings
        List<String> unsortedList3 = new ArrayList<String>();
        unsortedList3.add("banana");
        unsortedList3.add("apple");
        unsortedList3.add("cherry");
        unsortedList3.add("grape");
        unsortedList3.add("kiwi");

        // sort the list using a Comparator interface with an anonymous class
        Comparator<String> anonymousComparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        unsortedList3.sort(anonymousComparator);
        System.out.println("Sorted List using Comparator interface with an anonymous class: " + unsortedList3);

        // create a new list of unsorted Strings
        List<String> unsortedList4 = new ArrayList<String>();
        unsortedList4.add("banana");
        unsortedList4.add("apple");
        unsortedList4.add("cherry");
        unsortedList4.add("grape");
        unsortedList4.add("kiwi");

        // sort the list using a Comparator interface with a concrete class
        MyStringComparator myComparator = new MyStringComparator();
        unsortedList4.sort(myComparator);
        System.out.println("Sorted List using Comparator interface with a concrete class: " + unsortedList4);
    }

    // concrete class implementing Comparator interface
    public static class MyStringComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}
