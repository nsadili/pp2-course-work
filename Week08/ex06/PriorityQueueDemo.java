package Week08.ex06;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of bread in the store: ");
        int breadInStore = sc.nextInt();
        System.out.print("Enter the number of people in queue: ");
        int numPeople = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter the number of bread required by person " + (i + 1) + ": ");
            int breadRequired = sc.nextInt();
            queue.add(breadRequired);
        }

        int numSold = 0;
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            int breadRequired = queue.poll();
            breadInStore -= breadRequired;
            numSold++;
        }

        System.out.println("Maximum number of persons that can be sold required amount of bread: " + numSold);

        sc.close();
    }
}
