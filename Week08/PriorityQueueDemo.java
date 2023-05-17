package Week08;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2}; // Number of pieces of bread per person
        int requiredBread = 9; // Required amount of bread to be sold

        int maxPersonsSold = calculateMaxPersonsSold(breadPerPerson, requiredBread);
        System.out.println("Maximum number of persons who can be sold required amount of bread: " + maxPersonsSold);
    }

    private static int calculateMaxPersonsSold(int[] breadPerPerson, int requiredBread) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int bread : breadPerPerson) {
            queue.offer(bread);
        }

        int personsSold = 0;
        int totalBreadSold = 0;

        while (!queue.isEmpty()) {
            int breadNeeded = queue.poll();
            totalBreadSold += breadNeeded;

            if (totalBreadSold <= requiredBread) {
                personsSold++;
            } else {
                break; // Stop processing if the required amount of bread is exceeded
            }
        }

        return personsSold;
    }
}
