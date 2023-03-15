import java.util.ArrayList;
import java.util.Iterator;

public class Exercise_1_b_ii {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        
        myList.add(5);
        myList.add(26);
        myList.add(55);
        myList.add(4);
        
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}