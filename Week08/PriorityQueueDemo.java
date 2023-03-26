package Week08;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 4, 2}; 
        int breadInStore = 10; 

        Queue<Integer> queue = new PriorityQueue<>();
        int totalBreadRequired = 0;

        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
            totalBreadRequired += breadPerPerson[i];
        }

        int peopleCanBuyBread = 0;
        while (breadInStore > 0 && !queue.isEmpty()) {
            int breadRequiredByNextPerson = queue.poll();
            if (breadInStore >= breadRequiredByNextPerson) {
                breadInStore -= breadRequiredByNextPerson;
                peopleCanBuyBread++;
            }
        }

        System.out.println(peopleCanBuyBread + " persons can buy bread.");
    }
}
