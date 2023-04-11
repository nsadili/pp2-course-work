package Week10;

import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] elements;
    private int top;
    private final int size;

    public MyStack(int size) {
        this.size = size;
        this.elements = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T element) throws StackOverflowError {
        if (top == size - 1) {
            throw new StackOverflowError("Stack is full");
        }
        elements[++top] = element;
    }

    public T pop() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    public T peek() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}

