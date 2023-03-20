package Pw;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        int SumofBread = 18;

        int NumofPeople = 0;
        Queue<Integer> queue = new LinkedList<>();


        queue.add(1); 
        queue.add(2);
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(4);
        queue.add(4);




        while (!queue.isEmpty() && SumofBread > 0) {
            int breadPerPerson = queue.peek();
            int NumofBread = Math.min(breadPerPerson, SumofBread);
            SumofBread -= NumofBread;

            NumofPeople++;
            queue.poll();
        }

        System.out.println("How many persons will be able to buy bread: " + NumofPeople);
    
        // output: seven people will be able to buy bread.
    }
}
