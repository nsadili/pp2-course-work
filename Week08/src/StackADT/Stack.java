import java.util.NoSuchElementException;

public class Stack<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }
}