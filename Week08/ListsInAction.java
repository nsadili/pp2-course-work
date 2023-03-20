import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsInAction {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(3);
        nums.add(1);

        System.out.println(nums);
        for(int i=0; i<nums.size(); i++) System.out.println(nums.get(i) + " ");
        System.out.println();
        for(int el: nums) {
            System.out.println(el + " ");
            System.out.println();
        }

        Iterator it = nums.iterator();
        while(!it.hasNext()) System.out.println("[]");
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
            System.out.println();
        }


    }
}