import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9, 4);
        System.out.println("Original numbers: " + numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        numbers.sort(null);
        System.out.println(numbers);

        List<String> names = List.of("Ilkin", "Ilham", "Vusal");
        System.out.println("Original names: " + names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names);
        
    }
}
