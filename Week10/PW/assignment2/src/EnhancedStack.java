import java.util.ArrayList;
import java.util.EmptyStackException;

public class EnhancedStack<T> {
    private ArrayList<T> elements;
    private int top;
    private int capacity;

    public EnhancedStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid capacity: " + capacity);
        }
        elements = new ArrayList<>(capacity);
        top = -1;
        this.capacity = capacity;
    }

    public void push(T element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements.add(++top, element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(top--);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(top);
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        EnhancedStack<Integer> stack = new EnhancedStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}