import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static int buyBread(int[] breadPerPerson, int breadInStore) {
        int totalBreadSold = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        // Add all the people in the queue
        for (int bread : breadPerPerson) {
            queue.offer(bread);
        }
        
        // Process the queue until it's empty or we run out of bread
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            int breadForPerson = queue.poll();
            totalBreadSold += breadForPerson;
            breadInStore -= breadForPerson;
        }
        
        return totalBreadSold;
    }
    
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 4, 1, 3, 2};
        int breadInStore = 10;
        
        int totalBreadSold = buyBread(breadPerPerson, breadInStore);
        System.out.println("Total bread sold: " + totalBreadSold);
    }
}

