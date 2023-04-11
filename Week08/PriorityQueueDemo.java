import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PriorityQueueDemo {

    public static void main(String args[]) {
        int cnt=0;
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,3,4,5,2,1));
        Collections.sort(list);
        int store=13;
        for(int n: list){
            if(store>=n) {
                store -= n;
                cnt++;
            }
        }
        System.out.println("Store could sell bread to that amount of people: "+cnt);
    }
}
