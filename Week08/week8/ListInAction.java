package week8;
import java.util.*;
import java.util.List;

public class ListInAction {
    public static void main (String [] args){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(8);
        myList.add(2);
        myList.add(7);
        // myList.remove(Integer.valueOf(2));
        
        //for(int i = 0;i<myList.size(); i++ ){
        //    System.out.print(myList.get(i) + " ");
        //}
        //   for(int el : myList){
        //     el+=10;
        //     System.out.print(el+ " ");
        //    } 
        //    System.out.println();
        //    System.out.println(myList);
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
             int num = it.next();
            if(num == 7){
                it.remove();
            }
        }
            System.out.print(it.next()+ " ");
            System.out.println();
        }
        
    }
    

