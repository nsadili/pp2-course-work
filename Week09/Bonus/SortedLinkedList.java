// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.LinkedList;

class SortedLinkedList{
    public static void main(String[] args){

        //adding elements then sorting
        LinkedList<Integer> l = new LinkedList<Integer>();
        
        long startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            l.add((int)(Math.random()*100));
        }
        l.sort(null);
        long stopTime = System.nanoTime();
        System.out.print(l + " --------Time Taken for sorting:");
        System.out.println(stopTime - startTime);
    

        //adding elements while sorting
        LinkedList<Integer> l2 = new LinkedList<Integer>();

        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            add((int)(Math.random()*100), l2);
        }
        stopTime = System.nanoTime();
        System.out.print(l2 + " --------Time Taken:");
        System.out.println(stopTime - startTime);
    }

    //method to add to sorted location
    static void add(int num, LinkedList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(num <= list.get(i)){
                list.add(i, num);
                return;
            }
        }
        list.add(num);
    }
}