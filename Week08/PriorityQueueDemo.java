package Week08;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the number of pieces of bread per each person: ");
        int breadPerPerson = scanner.nextInt();

        System.out.print("The amount of bread in the store: ");
        int amountInTheStore = scanner.nextInt();

        PriorityQueue<Integer> breadQueue = new PriorityQueue<>();

        int numberOfPeople = amountInTheStore / breadPerPerson;
        for (int i = 0; i < numberOfPeople; i++) {
            breadQueue.offer(breadPerPerson);
        }

        int remainingBread = amountInTheStore % breadPerPerson;
        if (remainingBread > 0) {
            breadQueue.offer(remainingBread);
        }

        int maxNumberOfPeople = 0;
        int totalBreadSold = 0;
        while (!breadQueue.isEmpty() && totalBreadSold < amountInTheStore) {
            totalBreadSold += breadQueue.poll();
            if (totalBreadSold <= amountInTheStore) {
                maxNumberOfPeople++;
            }
        }

        System.out.println("The maximum number of people who can be sold required amount of bread is: " + maxNumberOfPeople);
        scanner.close();
    }
}
