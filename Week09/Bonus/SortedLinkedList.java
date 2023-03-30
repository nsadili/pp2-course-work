// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.LinkedList;

class SortedLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(2);
        l.add(9);
        l.add(1);
        l.add(5);
        
        
        long startTime = System.nanoTime();
        l.sort(null);
        long stopTime = System.nanoTime();
        System.out.print(l + " Time Taken:");
        System.out.println(stopTime - startTime);
    
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        startTime = System.nanoTime();
        l2.add(1);
        l2.add(2);
        l2.add(5);
        l2.add(9);
        stopTime = System.nanoTime();
        System.out.print(l2 + " Time Taken:");
        System.out.println(stopTime - startTime);
    }
}