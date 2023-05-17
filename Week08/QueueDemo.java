package Week08;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2}; // Number of pieces of bread per person
        int availableBread = 10; // Available amount of bread in the store

        int personsCanBuy = calculatePersonsCanBuy(breadPerPerson, availableBread);
        System.out.println("Number of persons who can buy bread: " + personsCanBuy);
    }

    private static int calculatePersonsCanBuy(int[] breadPerPerson, int availableBread) {
        Queue<Integer> queue = new LinkedList<>();
        for (int bread : breadPerPerson) {
            queue.offer(bread);
        }

        int personsCanBuy = 0;
        int currentBread = availableBread;

        while (!queue.isEmpty()) {
            int breadNeeded = queue.poll();
            if (breadNeeded <= currentBread) {
                currentBread -= breadNeeded;
                personsCanBuy++;
            } else {
                break; // Stop processing if there is not enough bread for the next person
            }
        }

        return personsCanBuy;
    }
}
