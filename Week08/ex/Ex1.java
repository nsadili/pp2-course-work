import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
    
        nums.add(10);
        nums.add(5);
        nums.add(3);
        nums.add(1);

       System.out.println(nums);
       System.out.println();

       for(int i = 0; i < nums.size(); i++)
       System.out.print(nums.get(i) + " ");
       System.out.println();

        for(int el : nums) {
            el = el + 10;
        System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(nums);
        
        Iterator<Integer> it = nums.iterator();

        if(!it.hasNext()) 
            System.out.println("[]");

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
            // remove the elements if it is greater than 4
        }
            System.out.println();

       }
 }
