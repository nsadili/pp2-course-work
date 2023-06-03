import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackEnhenced<T> {
    private ArrayList<T> stack;
    private int capacity;
    private int top;

    public StackEnhenced(int capacity) {
        this.stack = new ArrayList<>(capacity);
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
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
}