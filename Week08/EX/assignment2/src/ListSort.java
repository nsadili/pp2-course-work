import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3));

        System.out.println("Unsorted integerList: " + integerList);

        Collections.sort(integerList);
        System.out.println("Sorted integerList using Collections.sort(): " + integerList);

        integerList.sort(null);
        System.out.println("Sorted integerList using List.sort(): " + integerList);

        Comparator<Integer> descendingOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        integerList.sort(descendingOrder);
        System.out.println("Sorted integerList in descending order using a comparator: " + integerList);

        class AscendingOrder implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
        AscendingOrder ascendingOrder = new AscendingOrder();
        integerList.sort(ascendingOrder);
        System.out.println(
                "Sorted integerList in ascending order using a concrete class implementing Comparator: " + integerList);
    }
}