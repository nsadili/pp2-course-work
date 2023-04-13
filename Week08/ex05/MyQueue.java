package Week08.ex05;

import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people in the queue: ");
        int n = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        int totalBread = 0;
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the number of pieces of bread for person " + i + ": ");
            int bread = sc.nextInt();
            queue.add(bread);
        }
        
        System.out.print("Enter the amount of bread in the store: ");
        int breadInStore = sc.nextInt();
        
        while (!queue.isEmpty() && totalBread + queue.peek() <= breadInStore) {
            totalBread += queue.remove();
            count++;
        }
        
        System.out.println("Number of persons who can buy bread: " + count);

        sc.close();
    }
}
