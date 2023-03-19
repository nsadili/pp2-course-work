import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SortList {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(15);
        nums.add(10);
        nums.add(5);
        nums.add(1);

        
        Iterator<Integer> it = nums.iterator();

       

        while (it.hasNext()) {

            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

}