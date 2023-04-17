package Week08;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Show the quantities of bread per each person: ");
        int breadPerEachPerson = scan.nextInt();

        System.out.print("The amount of bread in the store: ");
        int amountInTheStore = scan.nextInt();

        Queue<Integer> breadQueue = new PriorityQueue<>();

        for (int i = 0; i < amountInTheStore / breadPerEachPerson; i++) {
            breadQueue.offer(breadPerEachPerson);
        }

        System.out.println("The number of people who will be able to buy bread is: " + breadQueue.size());
    }
}
