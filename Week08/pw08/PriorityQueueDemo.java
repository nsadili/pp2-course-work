package pw08;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
         PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the required amount of bread: ");
        int requiredAmount = scanner.nextInt();
        System.out.print("Enter the number of people in the queue: ");
        int numPeople = scanner.nextInt();

         System.out.println("Enter the number of pieces of bread required by each person:");
        for (int i = 0; i < numPeople; i++) {
            int numBread = scanner.nextInt();
            queue.add(numBread);
        }

         int numSold = 0;
        while (!queue.isEmpty() && requiredAmount > 0) {
            int numBread = queue.poll();
            requiredAmount -= numBread;
            if (requiredAmount >= 0) {
                numSold++;
            }
        }

         System.out.println("Number of persons that can be sold required amount of bread: " + numSold);
    }
}

