import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class B {
    public static void main(String[] args) {
        Set ts = new TreeSet<>();
        
        ts.add(2); ts.add(5);
        ts.add(3); ts.add(10);
        ts.add(1); ts.add(5);
        ts.add(2); ts.add(3);

        Iterator it = ts.iterator();

    //    Iterator it1Iterator = ts.descendingIterator;

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
