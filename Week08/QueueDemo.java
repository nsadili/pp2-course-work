package Week08;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        int breadInStore = 10;

        Queue<Integer> peopleInQueue = new LinkedList<>();

        Collections.addAll(peopleInQueue, 2, 1, 3, 2, 1);

        int numOFPeopleAbleToBuyBread = 0;
        while(breadInStore > 0 && !peopleInQueue.isEmpty()) {
            int breadNeeded = peopleInQueue.peek();
            if(breadInStore >= breadNeeded) {
                peopleInQueue.poll();
                breadInStore -= breadNeeded;
                numOFPeopleAbleToBuyBread++;
            }
            else break;
        }

        System.out.println("The number of people who can buy bread from the store is: " + numOFPeopleAbleToBuyBread);
    }
}
