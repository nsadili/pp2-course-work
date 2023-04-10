import java.util.EmptyStackException;

public class Stack<T> {
    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;
    private int size;
    private int capacity;

    public Stack(int capacity) {
        this.top = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void push(T data) throws StackOverflowError {
        if (isFull()) {
            throw new StackOverflowError();
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
