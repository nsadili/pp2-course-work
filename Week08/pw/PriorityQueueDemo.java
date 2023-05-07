import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of bread in the store: ");
        int amountInStore = input.nextInt();

        System.out.print("Enter the number of people in the queue: ");
        int numPeople = input.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 1; i <= numPeople; i++) {
            System.out.print("Enter the number of bread pieces for person ");
            int pieces = input.nextInt();
            queue.offer(pieces);
        }

        int numSold = 0;
        while (!queue.isEmpty() && amountInStore >= queue.peek()) {
            amountInStore -= queue.poll();
            numSold++;
        }

        System.out.println(numSold);
    }
}