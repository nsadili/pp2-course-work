import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount of bread per person: ");
        var perPerson = sc.nextInt(); // bread

        System.out.println("enter the amount of bread in store: ");
        var inStore = sc.nextInt(); // bread

        sc.close();

        Queue<Integer> breadQueue = new PriorityQueue<>();

        for (int i = 0; i < inStore; i++)
            breadQueue.offer(perPerson);

        breadQueue.offer(inStore / perPerson);

        System.out.println("people who can buy bread:" + breadQueue.size());

    }
}