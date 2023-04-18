package Week09.ex;

import java.util.Iterator;
import java.util.LinkedList;

public class SortedLinkedList {
    public static void main(String[] args) {
        
        LinkedList mixList = new LinkedList();

        mixList.add(7);
        mixList.add(4);
        mixList.add(37);
        mixList.add(90);
        mixList.add(2);
        mixList.add(17);

        Iterator it = mixList.iterator();
        if (it.hasNext()) {
                mixList.add(5);
        }
    }
}