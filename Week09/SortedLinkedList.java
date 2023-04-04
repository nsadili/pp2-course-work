import java.util.*;

public class SortedLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
   
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println("Linked List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        Collections.sort(list2);
  
        System.out.println("Linked List: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}