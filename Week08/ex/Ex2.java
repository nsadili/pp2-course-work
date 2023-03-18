import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 10 , 2, 1, 5, 11, 7);
        System.out.println(nums);
        // nums.sort(new DescendingComparator());
        // System.out.println(nums);
        
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(nums);




        // List<String> names = new ArrayList<>();
        // Collections.addAll(names, "Rufat", "Nariman", "shamil", "arzum");
        // System.out.println(names);
        // Collections.sort(names);
        // System.out.println(names);


    }
}

class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}