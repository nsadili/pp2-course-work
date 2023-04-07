import java.util.LinkedList;
import java.util.Random;
public class LinkedListEx {
    public static void main(String[] args) {


        int s = 10000;


        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();






        long startTime1 = System.nanoTime();
        Random rand1 = new Random();
        for (int i = 0; i < s; i++) {
            int value = rand1.nextInt(1000);
            int index = 0;
            while (index < list1.s() && list1.get(index) < value) {
                index++;
            }
            list1.add(index, value);


        }
        long endTime1 = System.nanoTime();
        System.out.println("Time to construct list in sorted order: " + (endTime1 - startTime1) + " ns");



        long startTime2 = System.nanoTime();
        Random rand2 = new Random();
        for (int i = 0; i < s; i++) {
            int value = rand2.nextInt(1000);
            list2.add(value);
        }
        list2.sort(Integer::compareTo);
        long endTime2 = System.nanoTime();
        System.out.println("Time to construct list and sort: " + (endTime2 - startTime2) + " ns");



        System.out.println("Elements in list 1:");
        for (int value : list1) {
            System.out.print(value + " ");
        }


        System.out.println();
        System.out.println("Elements in list 2:");
        for (int value : list2) {
            System.out.print(value + " ");
        }
    }
}
