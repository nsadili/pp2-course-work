package Week10;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class stack<T> {
    private int capacity;
    private ArrayList<T> stack;
    
    public stack(int capacity) {
        this.capacity = capacity;
        this.stack = new ArrayList<>();
    }
    
    public void push(T item) {
        if (stack.size() == capacity) {
            throw new IllegalArgumentException("full");
        }
        stack.add(item);
    }
    
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
    
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public boolean isFull() {
        return stack.size() == capacity;
    }
}
