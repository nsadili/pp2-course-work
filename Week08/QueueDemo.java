import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Number of pieces of bread per each person
        int[] breadPerPerson = {2, 1, 3, 2, 1};

        // Amount of bread in the store
        int breadInStore = 8;

        // Creating a queue to represent the line of people waiting for bread
        Queue<Integer> queue = new LinkedList<>();

        // Adding each person to the queue along with the number of pieces of bread they want to buy
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.offer(breadPerPerson[i]);
        }

        // Processing each person in the queue
        int numPeopleProcessed = 0;
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            // Subtracting the number of bread pieces each person wants to buy from the amount of bread in the store
            breadInStore -= queue.poll();
            numPeopleProcessed++;
        }

        // Printing the number of people who were able to buy bread
        System.out.println(numPeopleProcessed + " people were able to buy bread.");
    }
}
