import java.util.LinkedList;
import java.util.Queue;

public class BreadQueue {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 4, 2, 1, 3};
        int breadInStore = 10;

        int totalBreadSold = 0;
        Queue<Integer> queue = new LinkedList<>();

        // Add people to the queue
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.offer(breadPerPerson[i]);
        }

        // Serve people in the queue until there's no more bread in the store
        while (!queue.isEmpty() && breadInStore > 0) {
            int breadNeeded = queue.poll();
            if (breadNeeded <= breadInStore) {
                totalBreadSold += breadNeeded;
                breadInStore -= breadNeeded;
            }
        }

        System.out.println("Total persons able to buy bread: " + totalBreadSold);
    }
}
