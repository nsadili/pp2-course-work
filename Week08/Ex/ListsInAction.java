import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsInAction{
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();

        myList.add(9);
        myList.add(7);
        myList.add(3);
        myList.add(1);

       // System.out.println(myList.toString());
       //for(int c=0; c<myList.size();c++){
       // System.out.print(myList.get(c)+" ");

      // }
       //System.out.println();

       //for(Integer el : myList){
       // el = 10 + el;
        //System.out.print(el+" ");
       //}

       //System.out.println();

     Iterator<Integer> it= ((ArrayList<Integer>)myList).iterator();
     while(it.hasNext()){
        System.out.print(it.next()+" ");
     }
     System.out.println();



        

        
    }
}