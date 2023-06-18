package Week09;

import java.util.*;

public class SortedLinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 9, 1, 8, 2, 7, 4, 6};
        
        long startTime1 = System.nanoTime();
        LinkedList<Integer> sortedList1 = new LinkedList<>();
        for (int num : arr) {
            addInSortedOrder(sortedList1, num);
        }
        long endTime1 = System.nanoTime();
        System.out.println("Sorted LinkedList by adding elements in sorted order: " + sortedList1);
        System.out.println("Time taken to construct LinkedList by adding elements in sorted order: " + (endTime1 - startTime1) + " nanoseconds\n");
        
        long startTime2 = System.nanoTime();
        LinkedList<Integer> sortedList2 = new LinkedList<>();
        for (int num : arr) {
            sortedList2.add(num);
        }
        Collections.sort(sortedList2);
        long endTime2 = System.nanoTime();
        System.out.println("Sorted LinkedList by adding all elements and then sorting: " + sortedList2);
        System.out.println("Time taken to construct LinkedList by adding all elements and then sorting: " + (endTime2 - startTime2) + " nanoseconds\n");
    }
    
    public static void addInSortedOrder(LinkedList<Integer> list, int num) {
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()) {
            int current = itr.next();
            if (current > num) {
                itr.previous();
                itr.add(num);
                return;
            }
        }
        list.addLast(num);
    }
}

