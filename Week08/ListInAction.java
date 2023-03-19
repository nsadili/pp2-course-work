import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInAction {
     public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList();
        
        myList.add(5);
        myList.add(10);
        myList.add(3);
        myList.add(6);

        //System.out.println(myList.toString());
        
        //for (int i=0; i< myList.size(); i++) 
        //     System.out.println(myList.get(i)+ " ");
        //System.out.println();   
        
        //for (Integer el: myList){
        //    el = el * 2;
        //    System.out.println(el + " ");
       // }
        //System.out.println();

       // System.out.println(myList);

       Iterator<Integer> it = myList.iterator();
       
       while(it.hasNext()){
       System.out.println(it.next()+ " ");
       }

       System.out.println();
       

    }
}
