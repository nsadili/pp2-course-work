import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.multi.MultiListUI;

public class ListsInAction {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(10);
        myList.add(3);
        myList.add(6);

        // System.out.println(myList.toString());

        // for(int i=0; i < myList.size(); i++) 
        //     System.out.print(myList.get(i) + " ");
        //     System.out.println();

        // for(Integer el : myList) {
        //     el *=2;
        //     System.out.print(el + " ");
        // }
        // System.out.println();

        // System.out.println(myList);

        Iterator<Integer> it = myList.iterator();
        
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}