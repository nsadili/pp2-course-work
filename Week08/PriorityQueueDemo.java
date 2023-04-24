package Week08;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static int sellBread(int[] breadPerPerson, int breadInStore) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        int total_bread_sold = 0;
        while (!queue.isEmpty() && breadInStore > 0) {
            int bread_wanted = queue.remove();
            if (breadInStore >= bread_wanted) {
                breadInStore -= bread_wanted;
                total_bread_sold += bread_wanted;
            } else {
                break;
            }
        }

        return total_bread_sold;
    }

    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2, 1};
        int breadInStore = 10;
        int maxPersonsSold = sellBread(breadPerPerson, breadInStore);
        System.out.println("Maximum number of persons that can be sold the required amount of bread: " + maxPersonsSold);
    }
}

