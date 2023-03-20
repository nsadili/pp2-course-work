import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Pw3 {
    public static void main(String[] args) {
        int breadPerPerson[] = {3, 1, 2, 4, 5}; // number of bread pieces each person wants
        int breadIntStore = 14; // total number of bread pieces in the store

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        // add the number of bread pieces each person wants to the priority queue
        for (int bread : breadPerPerson) {
            que.add(bread);
        }

        System.out.println(que);
        int numPeople = 0;
        //sell bread to as many people as possible while there is still bread in the store
        while(!que.isEmpty() && que.peek() <= breadIntStore) {
            int head = que.poll();
            System.out.println("Selling " + head + "bread to person");
            breadIntStore -= head;
            numPeople++;
        }

        System.out.println("Maximum number of people that can buy bread: " + numPeople);
    }
}
