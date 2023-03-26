package Week08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give the number of pieces of bread per each person: ");
        int breadPerEachPerson = scan.nextInt();

        System.out.print("The amount of bread in the store: ");
        int amountInTheStore = scan.nextInt();

        Queue<Integer> breadQueue = new LinkedList<>();

        for (int i = 0; i < amountInTheStore / breadPerEachPerson; i++) {
            breadQueue.offer(breadPerEachPerson);
            scan.close();
        }

        breadQueue.offer(amountInTheStore % breadPerEachPerson);

        System.out.println("The number of people who will be able to buy bread is: " + breadQueue.size());
    }
}