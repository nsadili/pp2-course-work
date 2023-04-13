import java.util.LinkedList;
import java.util.Random;

public class LinkedListDemo {
    public static void main(String[] args) {
        int n = 10000; // number of elements to add
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Method 1: Adding elements in sorted order
        long startTime1 = System.currentTimeMillis();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n);
            if (list1.isEmpty() || num > list1.getLast()) {
                list1.add(num);
            } else {
                for (int j = 0; j < list1.size(); j++) {
                    if (num <= list1.get(j)) {
                        list1.add(j, num);
                        break;
                    }
                }
            }
        }
        long endTime1 = System.currentTimeMillis();

        // Method 2: Adding elements and sorting later
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n);
            list2.add(num);
        }
        list2.sort(null);
        long endTime2 = System.currentTimeMillis();

        // Print results
        System.out.println("Method 1: Adding elements in sorted order");
        System.out.println("Time taken: " + (endTime1 - startTime1) + " milliseconds");
        System.out.println("List elements: " + list1);

        System.out.println("Method 2: Adding elements and sorting later");
        System.out.println("Time taken: " + (endTime2 - startTime2) + " milliseconds");
        System.out.println("List elements: " + list2);
    }
}
