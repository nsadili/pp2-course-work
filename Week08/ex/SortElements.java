package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortElements {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 7, 1, 8, 3, 9, 4, 6);

       
        List<Integer> sortedNumbers1 = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers1);
        System.out.println("Sorted list using Collections.sort(): " + sortedNumbers1);

       
        List<Integer> sortedNumbers2 = new ArrayList<>(numbers);
        sortedNumbers2.sort(null);
        System.out.println("Sorted list using List.sort() with null argument: " + sortedNumbers2);
        sortedNumbers2 = new ArrayList<>(numbers);
        sortedNumbers2.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort() with natural order comparator: " + sortedNumbers2);

        
        List<Integer> sortedNumbers3 = new ArrayList<>(numbers);
        sortedNumbers3.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        System.out.println("Sorted list using anonymous class comparator: " + sortedNumbers3);

       
        List<Integer> sortedNumbers4 = new ArrayList<>(numbers);
        sortedNumbers4.sort(new ReverseOrderComparator());
        System.out.println("Sorted list using concrete class comparator: " + sortedNumbers4);
    }

    static class ReverseOrderComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }
}
