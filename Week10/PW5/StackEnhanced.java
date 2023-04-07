package PW5;

import java.util.EmptyStackException;

public class StackEnhanced<T> {
    private int capacity;
    private int size;
    private Object[] elements;
    
    public StackEnhanced(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T element) throws Exception {
        if (isFull()) throw new Exception();
        elements[size++] = element;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        T element = (T) elements[--size];
        elements[size] = null;
        return element;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return (T) elements[size - 1];
    }
}
