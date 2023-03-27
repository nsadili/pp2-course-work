package ex;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        int breadInStore = 5;

        int numPeople = queue.size();
        int numPeopleWhoCanBuy = 0;
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            numPeopleWhoCanBuy++;
            int numBreadRequested = queue.poll();
            breadInStore -= numBreadRequested;
        }

        System.out.println("Number of people in queue: " + numPeople);
        System.out.println("Number of people who can buy bread: " + numPeopleWhoCanBuy);
    }
}
