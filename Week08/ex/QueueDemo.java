package ex;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // Initialize queue of people and the amount of bread in the store
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        int breadInStore = 5;

        // Calculate how many people can buy bread
        int numPeople = queue.size();
        int numPeopleWhoCanBuy = 0;
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            numPeopleWhoCanBuy++;
            int numBreadRequested = queue.poll();
            breadInStore -= numBreadRequested;
        }

        // Print the results
        System.out.println("Number of people in queue: " + numPeople);
        System.out.println("Number of people who can buy bread: " + numPeopleWhoCanBuy);
    }
}
