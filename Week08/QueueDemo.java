package Week08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 2};
        int breadInStore = 10; 
        int numPeopleCanBuy = 0; 
        Queue<Integer> queue = new LinkedList<>(); 

        // add each person to the queue
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        // process each person in the queue
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            breadInStore -= queue.poll(); // remove the person from the queue and subtract their bread from the store
            numPeopleCanBuy++; 
        }

        System.out.println("Number of people who can buy bread: " + numPeopleCanBuy);
    }
}
