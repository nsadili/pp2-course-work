package Week8;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 2, 1}; // number of pieces of bread per person
        int breadInStore = 10; // total amount of bread in the store
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int totalBreadNeeded = 0;
        
        // Calculate the total amount of bread needed and add people to the priority queue
        for (int i = 0; i < breadPerPerson.length; i++) {
            totalBreadNeeded += breadPerPerson[i];
            queue.offer(breadPerPerson[i]);
        }
        
        // Process the priority queue and count the number of people who can buy bread
        int numPeopleWithBread = 0;
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            int breadNeeded = queue.poll();
            breadInStore -= breadNeeded;
            numPeopleWithBread++;
        }
        
        // Print the results
        System.out.println(numPeopleWithBread + " people can buy bread with " + breadInStore + " pieces left over.");
    }
}
