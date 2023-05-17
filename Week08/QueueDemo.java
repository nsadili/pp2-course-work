package Week08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount of bread per person: ");
        var perPerson = sc.nextInt(); // bread

        System.out.println("enter the amount of bread in store: ");
        var inStore = sc.nextInt(); // bread

        sc.close();

        Queue<Integer> breadQueue = new LinkedList<>();

        for (int i = 0; i < inStore; i++)
            breadQueue.offer(perPerson);

        breadQueue.offer(inStore % perPerson);

        System.out.println("people who can buy bread:" + breadQueue.size());

    }
}
