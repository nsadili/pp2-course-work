import java.util.EmptyStackException;

public class Stack<T> {
    private T[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(T element) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    public T pop() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        }
        T element = elements[top];
        elements[top--] = null;
        return element;
    }

    public T peek() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public static class StackFullException extends Exception {
        public StackFullException(String message) {
            super(message);
        }
    }
}
