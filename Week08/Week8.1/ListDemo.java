import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(7);
        nums.add(5);
        nums.add(9);
        nums.add(1);

        Iterator<Integer> it = nums.iterator();

       while (it.hasNext()) {

            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

}