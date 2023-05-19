import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<E> {
    private ArrayList<E> stack;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() >= maxSize;
    }

    public void push(E element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
}


