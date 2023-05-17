package Week10;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private List<T> stackList;
    private int maxSize;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackList = new ArrayList<>(maxSize);
        top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push element.");
        }
        stackList.add(element);
        top++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T poppedElement = stackList.remove(top);
        top--;
        return poppedElement;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
