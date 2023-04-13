package Week08;

import java.util.*;

public class SortTheElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        sortWithCollections(numbers);
        sortWithList(numbers);
        sortWithComparator(numbers);
        sortWithCustomComparator(numbers);
    }

   public static void sortWithCollections(List<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("Sorted using Collections.sort(): " + numbers);
    }

   public static void sortWithList(List<Integer> numbers) {
        numbers.sort(); // Use natural ordering
        System.out.println("Sorted using List.sort(): " + numbers);
    }

    public static void sortWithComparator(List<Integer> numbers) {
        Comparator<Integer> reverseOrder = new Comparator<>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        numbers.sort(reverseOrder);
        System.out.println("Sorted using Comparator interface: " + numbers);
    }

    public static void sortWithCustomComparator(List<Integer> numbers) {
        class MyComparator implements Comparator<Integer> {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
        MyComparator myComparator = new MyComparator();
        numbers.sort(myComparator);
        System.out.println("Sorted using concrete Comparator class: " + numbers);
    }
}

