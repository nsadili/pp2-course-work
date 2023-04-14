import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class JustClass {

    
    public static void main(String[] args) {

        Deque<Integer> list = new LinkedList<>();
        list.addFirst(5);
        list.addFirst(25);
        System.out.println(list);

        list.addFirst(45);

        System.out.println(list);

        System.out.println(list.getLast());

        NavigableSet<Integer> s = new TreeSet<>();

        s.add(5);
        s.add(3);
        s.add(9);
        System.out.println(s);
        System.out.println(s.last());

        System.out.println(s.floor(5));

        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("b");
        ll.add("c");
        // ll.addLast("d");
        ll.addFirst("E");
        System.out.println("The last element is: " +
        ll.getFirst());
        

    }
}
