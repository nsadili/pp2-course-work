package Week10.pw5;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {

    private List<E> stack;
    private int maxSize;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stack = new ArrayList<>(maxSize);
        top = -1;
    }

    public void push(E element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack.add(++top, element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(top--);
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }
}

