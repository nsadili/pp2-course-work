import java.util.*;
import java.time.*;

public class SortedLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> sortedList1 = new LinkedList<>();
        LinkedList<Integer> sortedList2 = new LinkedList<>();

        Random rand = new Random();
        int[] randomInts = new int[100000];
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = rand.nextInt(100000);
        }

        Instant start1 = Instant.now();
        for (int i = 0; i < randomInts.length; i++) {
            sortedList1.add(sortedIndex(sortedList1, randomInts[i]), randomInts[i]);
        }
        Instant end1 = Instant.now();
        Duration timeElapsed1 = Duration.between(start1, end1);
        System.out.println("Method 1: Add elements in sorted order");
        System.out.printf("Time taken: %d seconds %d milliseconds\n",
                timeElapsed1.getSeconds(), timeElapsed1.toMillisPart());
        System.out.println("LinkedList: " + sortedList1.toString());

        Instant start2 = Instant.now();
        for (int i = 0; i < randomInts.length; i++) {
            sortedList2.add(randomInts[i]);
        }
        Collections.sort(sortedList2);
        Instant end2 = Instant.now();
        Duration timeElapsed2 = Duration.between(start2, end2);
        System.out.println("\nMethod 2: Add all elements and sort later");
        System.out.printf("Time taken: %d seconds %d milliseconds\n",
                timeElapsed2.getSeconds(), timeElapsed2.toMillisPart());
        System.out.println("LinkedList: " + sortedList2.toString());
    }

    public static int sortedIndex(LinkedList<Integer> list, int value) {
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()) {
            int curr = itr.next();
            if (value < curr) {
                return itr.previousIndex();
            }
        }
        return list.size();
    }
}