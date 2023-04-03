import java.util.LinkedList;
import java.util.Queue;

public class BreadQueue {
    public static int calculateBuyers(int[] breadPerPerson, int breadInStore) {
        Queue<Integer> queue = new LinkedList<>();

        // add all the people to the queue
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        int totalBuyers = 0;
        while (!queue.isEmpty() && breadInStore > 0) {
            int breadPerPersonNow = queue.peek();
            if (breadInStore >= breadPerPersonNow) {
                // the person at the front of the queue can buy bread
                queue.poll();
                breadInStore -= breadPerPersonNow;
                totalBuyers++;
            } else {
                // not enough bread in store for the person at the front of the queue
                break;
            }
        }

        return totalBuyers;
    }

    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2};
        int breadInStore = 8;

        int totalBuyers = calculateBuyers(breadPerPerson, breadInStore);

        System.out.println("Total buyers: " + totalBuyers);
    }
}
