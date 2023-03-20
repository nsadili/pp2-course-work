package Pw;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        int sumOfBread = 18;

        int numOfPeople = 0;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1); 
        queue.add(2);
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(4);
        queue.add(4);

        while (!queue.isEmpty() && sumOfBread >= queue.peek()) {
            int breadPerPerson = queue.peek();
            sumOfBread -= breadPerPerson;

            numOfPeople++;
            queue.poll();
        }

        System.out.println("Maximum number of persons that can be sold required amount of bread: " + numOfPeople);
    }
}
