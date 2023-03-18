import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("asd"); l1.add("dsg"); l1.add("bew"); l1.add("opfe");

        Collections.sort(l1);
        System.out.println(l1.toString() + "\n");


        List<Integer> l2 = new LinkedList<>();
        l2.add(5); l2.add(9); l2.add(-16); l2.add(43);

        l2.sort(null);
        System.out.println(l2.toString() + "\n");
        

        Comparator<Integer> comp1 = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };
        l2.sort(comp1);
        System.out.println(l2.toString() + "\n");


        ComparatorClass comp2 = new ComparatorClass();
        l2.sort(comp2);
        System.out.println(l2.toString() + "\n");
    }

    public static class ComparatorClass implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}
