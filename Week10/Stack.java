import java.util.ArrayList;

public class Stack<T> {
    private int maxSize;
    private ArrayList<T> stack;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == maxSize;
    }

    public void push(T item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }
}