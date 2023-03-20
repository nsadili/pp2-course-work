import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of pieces of bread per each person: ");
            int breadPerEachPerson = sc.nextInt();

            System.out.print("The amount in the store: ");
            int amountInTheStore = sc.nextInt();

            Queue<Integer> breadQueue = new LinkedList<>();

            for (int i = 0; i < amountInTheStore / breadPerEachPerson; i++) {
                breadQueue.offer(breadPerEachPerson);
            }

            breadQueue.offer(amountInTheStore % breadPerEachPerson);

            System.out.println("Number of people who will be able to buy bread: " + breadQueue.size());
        }
    }
}
