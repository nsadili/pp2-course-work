import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static int calculateNumberOfCustomers(int[] breadPerPerson, int breadInStore) {
        Queue<Integer> queue = new LinkedList<>();
        int totalCustomers = 0;

        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            int breadNeeded = queue.remove();
            breadInStore -= breadNeeded;
            totalCustomers++;
        }

        return totalCustomers;
    }

    public static void main(String[] args) {
        int[] breadPerPerson = { 2, 3, 1, 4 };
        int breadInStore = 10;
        int numCustomers = calculateNumberOfCustomers(breadPerPerson, breadInStore);
        System.out.println(numCustomers + " customers can buy bread.");
    }
}
