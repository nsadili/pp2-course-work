package Week8;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 2, 1}; // number of pieces of bread per person
        int breadInStore = 10; // total amount of bread in the store
        
        Queue<Integer> queue = new LinkedList<>();
        int totalBreadNeeded = 0;
        int numPeopleWithBread = 0;
        
        // Calculate the total amount of bread needed and add people to the queue
        for (int i = 0; i < breadPerPerson.length; i++) {
            totalBreadNeeded += breadPerPerson[i];
            queue.offer(breadPerPerson[i]);
        }
        
        // Process the queue and count the number of people who can buy bread
        while (!queue.isEmpty() && breadInStore > 0) {
            int breadNeeded = queue.poll();
            if (breadNeeded <= breadInStore) {
                breadInStore -= breadNeeded;
                numPeopleWithBread++;
            }
        }
        
        // Print the results
        if (totalBreadNeeded <= breadInStore) {
            System.out.println("All " + breadPerPerson.length + " people can buy bread.");
        } else {
            System.out.println(numPeopleWithBread + " out of " + breadPerPerson.length + " people can buy bread.");
        }
    }
}

