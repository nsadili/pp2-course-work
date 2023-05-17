package Week10;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> stack;
    private int maxSize;

    public Stack(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(T element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cant push.");
        }
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == maxSize;
    }

    public int size() {
        return stack.size();
    }
}
