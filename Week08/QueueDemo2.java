import java.util.PriorityQueue;

public class QueueDemo2 {
    public static void main(String[] args) {
        int nbBreads[] = new int[] { 3, 4, 2, 6, 8, 3, 5, 2, 5, 8, 2, 4, 5, 8 };

    }

    static void sellBreads(PriorityQueue<Integer> needs, Integer availableCount) {

        while (!needs.isEmpty()) {
            if (needs.peek() <= availableCount) {
                System.out.println(needs.peek());
                availableCount -= needs.peek();
            }
            needs.poll();
            // else
            // break;
        }

        System.out.println("Remaining breads: " + availableCount);
    }
}
