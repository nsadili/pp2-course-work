
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MyPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> line = new PriorityQueue<Integer>();

        line.offer(5);
        line.offer(3);
        line.offer(1);
        line.offer(8);
        line.offer(2);

        int amount;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of bread: ");
        amount = sc.nextInt();

        var breadNum = 0;
        var peopleBuyBread = 0;

        while (line.size() != 0) {
            // System.out.println("Peek number: " + line.peek());
            breadNum += line.poll();

            if (breadNum > amount) {
                break;
            }

            peopleBuyBread++;

        }

        System.out.println("Number of People Buy Bread: " + peopleBuyBread);
    }
}
