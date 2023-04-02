import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numPeople = input.nextInt();

        System.out.print("Enter the amount of bread in the store: ");
        int breadInStore = input.nextInt();

        int[] breadPerPerson = new int[numPeople];

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter the number of pieces of bread for person " + (i + 1) + ": ");
            breadPerPerson[i] = input.nextInt();
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        int numPeopleWhoCanBuy = 0;
        while (!queue.isEmpty()) {
            int breadNeeded = queue.peek();
            if (breadInStore >= breadNeeded) {
                breadInStore -= breadNeeded;
                queue.poll();
                numPeopleWhoCanBuy++;
            } else {
                break;
            }
        }

        System.out.println(numPeopleWhoCanBuy + " people can buy bread from the store.");

    }

}