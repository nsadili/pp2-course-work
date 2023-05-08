package ex;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        int requiredBread = 7;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int numPeople = queue.size();
        int totalBread = 0;
        for (int i = 0; i < numPeople; i++) {
            int numBreadRequested = queue.poll();
            pq.add(numBreadRequested);
            totalBread += numBreadRequested;
            if (totalBread >= requiredBread) {
                break;
            }
        }
        int numPeopleWhoCanBuy = 0;
        totalBread = 0;
        while (!pq.isEmpty() && totalBread + pq.peek() <= requiredBread) {
            numPeopleWhoCanBuy++;
            totalBread += pq.poll();
        }

        System.out.println("Number of people in queue: " + numPeople);
        System.out.println("Maximum number of people who can buy bread: " + numPeopleWhoCanBuy);
    }
}
