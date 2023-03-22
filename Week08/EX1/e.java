package Week08.EX1;

import java.util.LinkedList;

public class e {
    public static void main(String[] args) {
        LinkedList<String> newLinkedList = new LinkedList<String>();

        newLinkedList.add("coffee");
        newLinkedList.add("tea");
        newLinkedList.add("bread");
        newLinkedList.add("butter");
        newLinkedList.add("eggs");
        newLinkedList.add("apple");
        newLinkedList.add("kiwi");
        newLinkedList.add("tomato");
        newLinkedList.add("potato");

        newLinkedList.removeFirst();
        System.out.println(newLinkedList);

        newLinkedList.removeLast();
        System.out.println(newLinkedList);
    }
}
