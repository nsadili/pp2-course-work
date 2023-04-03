import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {
    public static void main(String[] args) {
        Random random = new Random();
        
        LinkedList<Integer> sortedList = new LinkedList<>();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(50);
            addElementInSortedOrder(sortedList, num);
        }
        long endTime1 = System.nanoTime();
        long timeElapsed1 = endTime1 - startTime1;
        System.out.println("Time taken for adding elements in sorted order: " + timeElapsed1 + " ns");
        System.out.println("Sorted list: " + sortedList);

        LinkedList<Integer> unsortedList = new LinkedList<>();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(50);
            unsortedList.add(num);
        }
        unsortedList.sort(null);
        long endTime2 = System.nanoTime();
        long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Time taken for adding all elements and sorting later: " + timeElapsed2 + " ns");
        System.out.println("Unsorted list: " + unsortedList);
    }

    public static void addElementInSortedOrder(LinkedList<Integer> list, int num) {
        int index = 0;
        for (int element : list) {
            if (element > num) {
                list.add(index, num);
                return;
            }
            index++;
        }
        list.addLast(num);
    }
}
