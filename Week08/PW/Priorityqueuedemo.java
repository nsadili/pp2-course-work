package Week08.PW;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Priorityqueuedemo {
    public static void main(String[] args) {
        Queue<Integer> line = new LinkedList<>();
        line.offer(1);
        line.offer(2);
        line.offer(5);
        line.offer(6);
        System.out.println(line);

        int amount;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount of bread: ");
            amount = sc.nextInt();
        }
        var breadNum = 0;
        var peoplebuybread = 0;
  

        while (line.size() != 0) {
            breadNum += line.poll();
            
            if (breadNum > amount) {
                break;
            }

            peoplebuybread++;

        }

        System.out.println("How many people buy bread  " + peoplebuybread);

    }

}
