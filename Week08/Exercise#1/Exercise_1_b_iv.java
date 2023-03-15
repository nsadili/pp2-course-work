import java.util.ArrayList;
import java.util.Iterator;

public class Exercise_1_b_iv {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        
        myList.add(5);
        myList.add(26);
        myList.add(55);
        myList.add(4);
        
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
}
}


