package ex2;
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            if (list.isEmpty() || num >= list.getLast()) {
                list.addLast(num);
            }
       /*   else {
                int j = 0;
                while (num > list.get(j)) {
                    j++;
                }
                list.add(j, num);
            } */
           
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Duration of execution: "+duration+" ms");
        System.out.println("List elements: "+list.toString());
    }
}