import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        int nbBreads[] = new int[] { 3, 4, 2, 6, 8, 3, 5, 2, 5, 8, 2, 4, 5, 8 };

        LinkedList<Integer> needs = new LinkedList<>();

        for (int i : nbBreads) {
            needs.offer(i);
        }

        sellBreads(needs, 15);
    }

    static void sellBreads(LinkedList<Integer> needs, Integer availableCount) {

    }
}
