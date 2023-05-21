package ex2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList1 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            list.add(num);
        }
        Collections.sort(list);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Duration: "+duration+" ms");
        System.out.println("List elements: "+list.toString());
}
}
