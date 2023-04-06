import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInAction{
    public static void main(String[] args){

        List<Integer> myList = new ArrayList<>();

        myList.add(5);
        myList.add(10);
        myList.add(3);
        myList.add(6);

        //System.out.println(myList);

        //for (int i=0; i < myList.size(); i++)
        //System.out.print(myList.get(i) + " ");
        //System.out.println();

        //for(Integer e : myList){
        //e = 2 * e;
        
        //System.out.print(e + " ");
        //}
        //System.out.println();
        //System.out.println(myList);

        Iterator<Integer> it = myList.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
         }
        }
}