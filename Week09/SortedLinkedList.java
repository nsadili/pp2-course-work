package Week09;
import java.util.LinkedList;
import java.util.Random;
public class SortedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(10000);
            if (list.isEmpty() || num >= list.getLast()) {
                list.add(num);
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if (num < list.get(j)) {
                        list.add(j, num);
                        break;
                    }
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Time taken to construct the list using method 1: " + duration + "ms");
        System.out.println("List of elements in sorted order: " + list);
    }
}
