package Week08;
import java.util.*;
public class PtiorityQueueDemo {
    public static void main(String[] args){
        Queue<Integer> perperson = new LinkedList<>();
        perperson.offer(2);
        perperson.offer(3);
        perperson.offer(1);
        perperson.offer(4);
        perperson.offer(1);
        PriorityQueue<Integer> sorted=new PriorityQueue<>(perperson);

        int bread = 9;
        int people = 0;
        int bought = 0;
        while (!sorted.isEmpty() && bought < bread) {
            int numBread = sorted.poll();
            if (bought + numBread <= bread) {
                people++;
                bought += numBread;
            } else {
                break;
            }
        }
        System.out.println(people);
    }
}
