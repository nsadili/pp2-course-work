import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedListDemo {

    public static void main(String[] args) {
        
        // Generate a list of random integers
        Random rand = new Random();
        int size = 10000;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(10000));
        }
        
        // Method 1: Adding an element in the sorted order
        long start1 = System.nanoTime();
        LinkedList<Integer> sortedList1 = new LinkedList<>();
        for (Integer num : list) {
            int index = 0;
            while (index < sortedList1.size() && num > sortedList1.get(index)) {
                index++;
            }
            sortedList1.add(index, num);
        }
        long end1 = System.nanoTime();
        
        // Method 2: Adding all the elements and sorting them later
        long start2 = System.nanoTime();
        LinkedList<Integer> sortedList2 = new LinkedList<>(list);
        sortedList2.sort(null);
        long end2 = System.nanoTime();
        
        // Print the sorted lists and the time consumed by each method
        System.out.println("Method 1 - Sorted LinkedList: " + sortedList1);
        System.out.println("Method 1 - Time consumed: " + (end1 - start1) + " ns");
        System.out.println("Method 2 - Sorted LinkedList: " + sortedList2);
        System.out.println("Method 2 - Time consumed: " + (end2 - start2) + " ns");
    }
}
