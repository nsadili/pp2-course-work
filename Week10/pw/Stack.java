import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {
    private final int capacity;
    private final List<E> elements;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new ArrayList<>();
    }

    public void push(E element) {
        if (elements.size() >= capacity) {
            throw new RuntimeException("Stack is full. Cannot push element.");
        }
        elements.add(element);
    }

    public E pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public E peek() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
