import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingElements {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(1);
    list.add(9);
    list.add(0);

    // Try Collections.sort() method
    Collections.sort(list);
    System.out.println(list);

    // Try List.sort() method
    list.sort(null);
    System.out.println(list);

    // Try Comparator interface

    // Anonymous class
    Comparator<Integer> acomparator = Comparator.naturalOrder();
    Collections.sort(list, acomparator);

    // Concrete class
    AComparator comparator = new AComparator();
    Collections.sort(list, comparator);

    System.out.println(list);

  }
}

class AComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    return o1.compareTo(o2);
  }
}
