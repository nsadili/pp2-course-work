package Week08.PW;

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
        System.out.println("Amount of bread: ");

        amount = sc.nextInt();

        int bread = 0;
        int buyBread = 0;

        while (line.size() != 0) 
        {
            bread += line.poll();
            
            if (bread > amount)
             {
                break;
            }

            buyBread++;

        }

        System.out.println("Number of People which Buy Bread: " + buyBread);

    }

}