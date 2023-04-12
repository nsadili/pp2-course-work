import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> elements;
    private int maxSize;

    public Stack(int maxSize) {
        this.elements = new ArrayList<T>();
        this.maxSize = maxSize;
    }

    public void push(T element) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        elements.add(element);
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean isFull() {
        return elements.size() >= maxSize;
    }
}
