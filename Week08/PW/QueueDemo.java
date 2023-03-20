import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> line = new LinkedList<>();

        line.offer(5);
        line.offer(2);
        line.offer(6);
        line.offer(9);
        line.offer(3);
        System.out.println(line);

        int amount;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of bread: ");
        amount = scan.nextInt();

        var breadNum = 0;
        var peopleBuyBread = 0;

        while (line.size() != 0) {
            breadNum += line.poll();
            
            if (breadNum > amount) {
                break;
            }

            peopleBuyBread++;

        }

        System.out.println("Number of People Buy Bread: " + peopleBuyBread);

    }

}
