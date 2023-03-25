import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {5, 2, 4, 7, 3, 2};
                int breadInStore = 10; 

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a); 

        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        int numPeopleSold = 0;
        int numBreadSold = 0;

        while (!queue.isEmpty() && numBreadSold < breadInStore) {
            int breadReq = queue.poll(); 
            if (numBreadSold + breadReq <= breadInStore) { 
                numPeopleSold++;
                numBreadSold += breadReq;
            }
        }

        System.out.println("Maximum number of people that can be sold the required amount of bread: " + numPeopleSold);
    }
}
