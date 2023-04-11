import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]) {
        int cnt=0;
        Queue<Integer> list =  new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
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
