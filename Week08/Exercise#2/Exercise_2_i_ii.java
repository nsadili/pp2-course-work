import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_2_i_ii {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(30);
        myList.add(20);
        myList.add(40);
        
        //Here's the first Sort method 
        Collections.sort(myList);
        System.out.println("Here's thee sorted list: " + myList.toString());
        
        //Here's the second List Sort method 
        myList.sort(null); 
        System.out.println("Sorted list using List.sort() method: " + myList.toString());
   }
}