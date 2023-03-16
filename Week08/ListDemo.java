import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(5);
        nums.add(3);
        nums.add(1);

        // System.out.println(nums);

        // for(var i=0;i<nums.size();i++){
        // System.out.print(nums.get(i) + " ");
        // }
        // System.out.println();

        // for(int el : nums){
        // System.out.print(el + " ");
        // }
        // System.out.println();

        Iterator<Integer> it = nums.iterator();

       

        while (it.hasNext()) {

            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

}