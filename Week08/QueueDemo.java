package Week08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of pieces of bread each person should receive: ");
        int breadPerPerson = scanner.nextInt();

        System.out.print("Please enter the total number of pieces of bread in the store: ");
        int totalBread = scanner.nextInt();

        Queue<Integer> breadQueue = new LinkedList<>();

        int numberOfPopleInGroups = totalBread / breadPerPerson;
        for (int i = 0; i < numberOfPopleInGroups; i++) {
            breadQueue.offer(breadPerPerson);
        }

        int remainingBread = totalBread % breadPerPerson;
        if (remainingBread > 0) {
            breadQueue.offer(remainingBread);
        }

        System.out.println("The number of customers who can purchase bread is: " + breadQueue.size());
        scanner.close();
    }
}
 