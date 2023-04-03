package Week08.classwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ListInAction{
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(4);
        mylist.add(3);
        mylist.add(5);
        mylist.add(4);
        mylist.add(1);
        for (int i = 0; i < mylist.size(); i++) {
            System.out.print(mylist.get(i)+(" "));
        }
        System.out.println();
        Iterator<Integer> it = mylist.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
        it.remove();   
    }
}