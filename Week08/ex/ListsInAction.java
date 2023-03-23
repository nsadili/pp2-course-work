package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsInAction {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(5);
        mylist.add(7);
        mylist.add(9);
        // mylist.remove(Integer.valueOf(5));
        // System.out.println(mylist);

        // System.out.println(mylist);

        // for(int i=0;i<mylist.size();i++)
        // System.out.println(mylist.get(i));
        // System.out.println();

        // for( int el: mylist)
        // System.out.println(el + " ");
        // System.out.println();
        Iterator<Integer> it = mylist.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
