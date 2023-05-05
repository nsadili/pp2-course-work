import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingElements {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 7, 1, 8, 3, 9, 4, 6);

       
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        System.out.println("Sorted list using Collections.sort(): " + sortedList);

       
        List<Integer> sortedList2 = new ArrayList<>(numbers);
        sortedList2.sort(null);
        System.out.println("Sorted list using List.sort() with null argument: " + sortedList2);
        sortedList2 = new ArrayList<>(numbers);
        sortedList2.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort() with natural order comparator: " + sortedList2);

        
        List<Integer> sortedList3 = new ArrayList<>(numbers);
        sortedList3.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        System.out.println("Sorted list using anonymous class comparator: " + sortedList3);

       
        List<Integer> sortedNumbers4 = new ArrayList<>(numbers);
        sortedNumbers4.sort(new ReversedOrderComparator());
        System.out.println("Sorted list using concrete class comparator: " + sortedNumbers4);
    }

    static class ReversedOrderComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }
}