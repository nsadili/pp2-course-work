package Week08;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 2};
        int breadInStore = 10; 
        int numPeopleCanBuy = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for (int i = 0; i < breadPerPerson.length; i++) {
            pq.add(breadPerPerson[i]);
        }

        // process each person in the priority queue
        while (!pq.isEmpty() && breadInStore >= pq.peek()) {
            breadInStore -= pq.poll(); // remove the person from the priority queue and subtract their bread from the store
            numPeopleCanBuy++;
        }

        System.out.println("Maximum number of people who can buy bread: " + numPeopleCanBuy);
    }
}
