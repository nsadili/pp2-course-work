package pw;

import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        //using linked list with addlast, removelast makes it behave like stack

        list.addLast(2);
        list.addLast(3);
        list.addLast(8);
        list.addLast(1);
        list.addLast(7);
        list.addLast(5);

        System.out.println(list);

        list.removeLast();
        list.removeLast();
        list.removeLast();

        System.out.println(list);
    }
}
