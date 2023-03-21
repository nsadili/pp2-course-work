import java.util.PriorityQueue;
import java.util.Queue;

public class BreadPriorityQueueDemo {
    public static void main(String[] args) {
        int[] piecesPerPerson = { 5, 7, 1, 4, 1 }; // number of bread pieces
        int requiredBread = 8; // total number of bread pieces required to sell
        int numPeopleInQueue = piecesPerPerson.length;

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < numPeopleInQueue; i++) {
            queue.offer(piecesPerPerson[i]); // add each person's bread request 
        }

        int numPeopleServed = 0;
        int totalBreadServed = 0;
        while (!queue.isEmpty()) {
            int nextPersonRequest = queue.peek(); // get the next person's bread request without removing them from the queue
            if (totalBreadServed + nextPersonRequest <= requiredBread) {
                totalBreadServed += queue.poll();
                numPeopleServed++;
            } else {
                break; // stop serving people when we reach the required amount of bread
            }
        }

        System.out.println(numPeopleServed + " customer can buy bread");
    }
}
