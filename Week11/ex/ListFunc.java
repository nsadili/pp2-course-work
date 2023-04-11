import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListFunc {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(87);
        lst.add(2);
        lst.add(45);
        lst.add(13);
        lst.add(9);
        lst.add(99);

        Collections.sort(lst);
        Collections.reverse(lst);
        System.out.println(lst);

        lst.stream().sorted(Comparator.reverseOrder()).forEach((s) -> System.out.println(s));

    }
}
