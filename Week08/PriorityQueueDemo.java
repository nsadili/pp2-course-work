import java.util.PriorityQueue;
import java.util.Collection;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> breadQueue = new PriorityQueue<>();//Number of breads each customer needs
        breadQueue.add(2); 
        breadQueue.add(3); 
        breadQueue.add(1);
        breadQueue.add(1);
        breadQueue.add(5);
        breadQueue.add(2);
        breadQueue.add(3);
        breadQueue.add(1); 
        breadQueue.add(2); 
        System.out.println(breadQueue);

        int breadIntStore=20;
        int customers=0;
        while(!breadQueue.isEmpty() && breadQueue.peek() <= breadIntStore) {
            int head = breadQueue.poll();
            breadIntStore -= head;
            customers++;
        }

        System.out.println("Maximum number of people that can buy bread: " + customers);
    }
}
