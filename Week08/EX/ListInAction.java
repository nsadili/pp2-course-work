package EX;
import java.util.ArrayList;
import java.util.List;
import javax.swing.plaf.multi.MultiListUI;
import java.util.Iterator;

public class ListInAction
{
    public static void main(String[] args) 
    {

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(10);
        myList.add(3);
        myList.add(6);

    


        Iterator<Integer> it= ((ArrayList<Integer>)myList).iterator();
        while(it.hasNext()){
           System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}