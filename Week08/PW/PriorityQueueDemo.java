package Week08.PW;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 4, 2}; 
        int breadInStore = 10; 

        int totalPeople = breadPerPerson.length;
        int peopleCanBuy = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

      
        for (int i = 0; i < totalPeople; i++) {
            priorityQueue.offer(breadPerPerson[i]);
        }

      
        while (!priorityQueue.isEmpty() && breadInStore > 0) {
            int breadNeeded = priorityQueue.poll(); 

            if (breadNeeded <= breadInStore) {
                breadInStore -= breadNeeded;
                peopleCanBuy++;
            } else {
                break; 
            }
        }

        System.out.println("Number of people able to buy bread: " + peopleCanBuy);
    }
}
