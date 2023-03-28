import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        int[] breadPerPerson = {1, 2, 3, 1, 2, 2, 1, 3};
        int breadInStore = 10;
        int numberOfPeople = 0;

        Queue<Integer> queue = new PriorityQueue<>();
        for (int bread : breadPerPerson) {
            queue.offer(bread);
        }

        while (!queue.isEmpty()) {
            int breadNeeded = queue.poll();
            if (breadNeeded <= breadInStore) {
                numberOfPeople++;
                breadInStore -= breadNeeded;
            } else {
                break;
            }
        }

        System.out.println(numberOfPeople + "people could buy bread.");
    }

}
