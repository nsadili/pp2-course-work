import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numPeople = input.nextInt();

        System.out.print("Enter the number of bread pieces per person: ");
        int breadPerPerson = input.nextInt();

        System.out.print("Enter the amount of bread in the store: ");
        int breadInStore = input.nextInt();

        for (int i = 0; i < numPeople; i++) {
            queue.offer(-breadPerPerson);
        }

        int numBought = 0;
        while (!queue.isEmpty() && breadInStore >= -queue.peek()) {
            int breadNeeded = -queue.poll();
            breadInStore -= breadNeeded;
            numBought++;
            queue.offer(-breadPerPerson);
        }

        System.out.println(numBought + " people were able to buy bread.");
    }
}
