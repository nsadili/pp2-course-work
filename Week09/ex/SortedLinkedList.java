import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SortedLinkedList {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.add(2);
        list.add(3);
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(99);
        list.add(12);

      //  list.sort(Comparator c);

        //System.out.println(list.sort(Comparator comp));

        Iterator it = list.iterator();
        if (it.hasNext()) {
         //   if(it.next() < 7) {
                list.add(7);
          //  }
        }
    }
}
