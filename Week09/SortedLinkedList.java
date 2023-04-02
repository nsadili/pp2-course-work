package Week09;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class SortedLinkedList {
    public static void main(String[] args) {
            
        List<Integer> sortedAfterCreation= new LinkedList<Integer>();

        Random rn1 = new Random();

        for(int i = 0; i < 10; i++){
            int num = rn1.nextInt(100);
            sortedAfterCreation.add(num);
        }
        System.out.println(sortedAfterCreation);

        long startTime1 = System.currentTimeMillis();
        Collections.sort(sortedAfterCreation);
        long endTime1 = System.currentTimeMillis();

        System.out.println(sortedAfterCreation);
        System.out.println(endTime1-startTime1 + "ms");


        LinkedList<Integer> sortedWhileCreation= new LinkedList<Integer>();


        Random rn2 = new Random();

    
        long startTime2 = System.currentTimeMillis();
        
        sortedWhileCreation.add(rn2.nextInt(100));

        for (int i = 1; i < 10; i++) {
            int num = rn2.nextInt(100);
            ListIterator<Integer> iter = sortedWhileCreation.listIterator();
            while (iter.hasNext()) {
                if (num < iter.next()) {
                    iter.previous();
                    iter.add(num);
                    break;
                }
            }
            if (!iter.hasNext()) {
                sortedWhileCreation.addLast(num);
            }
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println(sortedWhileCreation);


        System.out.println(endTime2-startTime2 + "ms");

    }

    
    
}
