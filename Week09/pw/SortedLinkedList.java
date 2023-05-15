import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class SortedLinkedList {

    public static void main(String[] args) {
        int numElements = 1000; 
        int maxRandomValue = 1000; 
        
    
        LinkedList<Integer> sortedList = new LinkedList<>();
        long begin = System.nanoTime(); 
        
        Random random = new Random();
        for (int i = 0; i < numElements; i++) {
            int e = random.nextInt(maxRandomValue);
            addElement(sortedList, e);
        }
        
        long end = System.nanoTime(); 
        long duration = end - begin; 
        
       
        System.out.println("Time " + duration);
        System.out.println("Elements " + sortedList);
    
    }

    public static void addElement(LinkedList<Integer> list, int e) {
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int current = it.next();
            if (e <= current) {
                it.previous();
                it.add(e);
                return;
            }
        }
        list.add(e); 
    }
}