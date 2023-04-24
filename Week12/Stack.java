import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private final ArrayList<T> stack;
    private final int capacity;
    private int top;

    public Stack(int capacity) {
        this.stack = new ArrayList<>(capacity);
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(T element) {
        if (top == capacity - 1) {
            throw new StackOverflowException("Stack is full.");
        }
        stack.add(++top, element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(top--);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(top);
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

    public class StackOverflowException extends RuntimeException {
        public StackOverflowException(String message) {
            super(message);
        }
    }
}
