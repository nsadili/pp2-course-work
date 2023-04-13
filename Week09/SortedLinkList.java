package Week9

import java.util.Random;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class SortedLinkedList {
    Node head;

    public SortedLinkedList() {
        head = null;
    }

    public void addElementSorted(int value) {
        Node newNode = new Node(value);
        if (head == null || head.data >= value) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SortedLinkList {
    public static void main(String[] args) {
        SortedLinkedList list1 = new SortedLinkedList();
        SortedLinkedList list2 = new SortedLinkedList();
        Random random = new Random();

        // Method 1:
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list1.addElementSorted(random.nextInt(1000));
        }
        long endTime1 = System.nanoTime();
        long timeElapsed1 = endTime1 - startTime1;
        System.out.println("Method 1: Time taken to construct Sorted LinkedList: " + timeElapsed1 + " ns");
        list1.printList();

        // Method 2:
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list2.addElementSorted(random.nextInt(1000));
        }
        long endTime2 = System.nanoTime();
        long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Method 2: Time taken to construct Sorted LinkedList: " + timeElapsed2 + " ns");
        list2.printList();
    }
}
