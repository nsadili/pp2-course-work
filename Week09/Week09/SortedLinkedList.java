package Week09;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class SortedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();

        // Method 1 - Adding element in the sorted order
        long methodOneStarts = System.nanoTime();
        for (int i = 0;i < 100; i++) {
            int randomNumber = random.nextInt(100);
            ListIterator<Integer> iterator = list.listIterator();
            while (iterator.hasNext()) {
                if (randomNumber < iterator.next()) {
                    iterator.previous();
                    iterator.add(randomNumber);
                    break;
                }
            }
            if (!iterator.hasNext()) {
                iterator.add(randomNumber);
            }
        }
        long methodOneEnds = System.nanoTime();
        System.out.println("Time elapsed for the first method: " + (methodOneEnds - methodOneStarts));

        long methodTwoStarts = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            list.add(randomNumber);
        }
        list.sort(null);
        long methodTwoEnds = System.nanoTime();
        System.out.println("Time elapsed for the second method: " + (methodTwoEnds - methodTwoStarts));

        System.out.println(list.toString());
    }
}
