package pw;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2}; 
        int breadInStore = 10;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 
        for (int i = 0; i < breadPerPerson.length; i++) {
            priorityQueue.offer(breadPerPerson[i]); 
        }

        int count = 0; 
        while (!priorityQueue.isEmpty() && breadInStore >= priorityQueue.peek()) { 
            breadInStore -= priorityQueue.poll(); 
            count++; 
        }

        System.out.println("Max number of people who can buy bread: " + count);
    }
}
