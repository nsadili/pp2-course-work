package Week09;

import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> sortedList = new LinkedList<>();
        LinkedList<Integer> unsortedList = new LinkedList<>();

        Random rand = new Random();
        long startTime, endTime, elapsedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(10000);
            addInSortedOrder(sortedList, num);
        }
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Time to construct sorted list: " + elapsedTime + " nanoseconds");
        System.out.println("Sorted list: " + sortedList);
        

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(10000);
            unsortedList.add(num);
        }
        unsortedList.sort(null);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Time to construct unsorted list and sort: " + elapsedTime + " nanoseconds");
        System.out.println("Unsorted list: " + unsortedList);
    }

    public static void addInSortedOrder(LinkedList<Integer> list, int num) {
        int index = 0;
        while (index < list.size() && list.get(index) < num) {
            index++;
        }
        list.add(index, num);
    }
}