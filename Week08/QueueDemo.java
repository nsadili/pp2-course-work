package Week08;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of bread for each person: ");
        int breadforEachPerson = scan.nextInt();

        System.out.print("Enter the number of bread at the store: ");
        int amountatTheStore = scan.nextInt();

        Queue<Integer> breadQueue = new LinkedList<>();

        for (int i = 0; i < amountatTheStore / breadforEachPerson; i++) {
            breadQueue.offer(breadforEachPerson);
        }

        breadQueue.offer(amountatTheStore % breadforEachPerson);

        System.out.println("The number of people who can buy bread is: " + breadQueue.size());
    }
}
