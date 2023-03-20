package Week08;
import java.util.*;

public class SortTheElementsOfTheLists {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(18,5,4,9,3,1,2,0 ));
        Collections.sort(numbers);
        System.out.println("sorted list using Collections.sort(): " + numbers);
        numbers.sort(null);
        System.out.println("sorted list using List.sort(): " + numbers);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };
        numbers.sort(comparator);
        System.out.println("sorted list using comparator intr  with anon class: " + numbers);
        CustomComparator customComparator = new CustomComparator();
        numbers.sort(customComparator);
        System.out.println("Sorted list using comparator intr with a conc class: " + numbers);
    }
    static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b - a;
        }
    }
}
