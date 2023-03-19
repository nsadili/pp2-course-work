import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> line = new LinkedList<>();

        line.offer(3);
        line.offer(4);
        line.offer(7);
        line.offer(1);
        line.offer(2);
        System.out.println(line);

        int amount;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of bread ");

        amount = sc.nextInt();

        int breadNum = 0;
        int peopleBuyBread = 0;

        while (line.size() != 0) 
        {
            breadNum += line.poll();
            
            if (breadNum > amount)
             {
                break;
            }

            peopleBuyBread++;

        }

        System.out.println("Number of People which Buy Bread: " + peopleBuyBread);

    }

}