import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedListDemo {

    public static void main(String[] args) {
        int numElements = 10000; // Example number of elements

        // Method 1: Add elements in sorted order
        LinkedList<Integer> sortedList1 = new LinkedList<>();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            int num = new Random().nextInt();
            addElementInSortedOrder(sortedList1, num);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for method 1: " + (endTime1 - startTime1) + " ms");
        printList(sortedList1);

        // Method 2: Add elements and sort them later
        LinkedList<Integer> sortedList2 = new LinkedList<>();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            int num = new Random().nextInt();
            sortedList2.add(num);
        }
        Collections.sort(sortedList2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken for method 2: " + (endTime2 - startTime2) + " ms");
        printList(sortedList2);
    }

    private static void addElementInSortedOrder(LinkedList<Integer> list, int num) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (num >= list.get(i)) {
                index = i + 1;
            } else {
                break;
            }
        }
        list.add(index, num);
    }

    private static void printList(LinkedList<Integer> list) {
        System.out.println("Sorted list:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

