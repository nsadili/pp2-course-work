import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of pieces of bread per each person: ");
            int breadPerEachPerson = sc.nextInt();

            System.out.print("The amount in the store: ");
            int amountInTheStore = sc.nextInt();

            Queue<Integer> breadQueue = new LinkedList<>();

            int remainingBread = amountInTheStore;
            int persons = 0;

            while (remainingBread >= breadPerEachPerson) {
                breadQueue.offer(breadPerEachPerson);
                remainingBread -= breadPerEachPerson;
                persons++;
            }

            if (remainingBread > 0) {
                breadQueue.offer(remainingBread);
                persons++;
            }

            System.out.println("Number of people who will be able to buy bread: " + persons);
        }
    }
}

