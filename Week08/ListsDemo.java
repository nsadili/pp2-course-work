import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsDemo{
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(3);
        nums.add(1);

        //System.out.println(nums);

        /*for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i)+" ");
            System.out.println();
        }*/
        /*for(Integer el:nums){
            //el=el+10;
            System.out.println(el + " ");
        }*/

        Iterator it = nums.iterator();

        if(!it.hasNext()){
            System.out.println("[]");
        }
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}