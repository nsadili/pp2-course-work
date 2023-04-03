import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        int size= 5;
        Random num= new Random();
        long s= System.nanoTime();
        for(int i=0; i<size;i++){
            int num2= num.nextInt(1000);
            int index=0;
            while(index<l1.size() && num2>l1.get(index)){
                index++;
            }
            l1.add(index,num2);
        }
        long e= System.nanoTime();
        System.out.println("Time estimated: "+ (e-s));
        System.out.println("List1: "+ l1);
        // Second way where adding all the elements and sorting them later
        LinkedList<Integer> l2= new LinkedList<>();
        long s2= System.nanoTime();
        for(int i=0; i<size;i++){
            int num3= num.nextInt(1000);
            l2.add(num3);
        }
        Collections.sort(l2);
        long e2= System.nanoTime();
        System.out.println("Time estimated second time: "+ (e2-s2));
        System.out.println("List2: "+l2);

        
    }
}