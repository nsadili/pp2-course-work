import java.util.LinkedList;
import java.util.Queue;

public class BreadQueueDemo {
    public static void main(String[] args) {
        int[] piecesPerPerson = { 5, 7, 1, 4, 1 }; // number of bread pieces each person wants to buy
        int availableBread = 8; // total number of bread pieces available in the store
        int numPeopleInQueue = piecesPerPerson.length;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numPeopleInQueue; i++) {
            queue.offer(piecesPerPerson[i]); // add each person's bread request to the queue
        }

        int numPeopleServed = 0;
        while (!queue.isEmpty()) {
            int nextPersonRequest = queue.poll(); 
            if (availableBread >= nextPersonRequest) {
                // if there is enough bread, serve the person and reduce the available bread
                availableBread -= nextPersonRequest;
                numPeopleServed++;
            } else {
                break; // stop serving people when there's not enough bread
            }
        }

        System.out.println(numPeopleServed + " customer can buy bread");
    }
}
