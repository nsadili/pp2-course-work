import java.util.ArrayList;
import java.util.Iterator;

public class ListsInAction{
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(9);
        // System.out.println(myList.toString());

        // for(int c=0;c<myList.size();c++){
        //     System.out.println(myList.get(c));
        // }

        // for(int el: myList){
        //     el +=10;
        //     System.out.println(el);
        // }

        Iterator<Integer> it = ((ArrayList<Integer>)myList).iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
    }
}