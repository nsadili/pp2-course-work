import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        Node current = top;
        System.out.print("Top -> ");
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
