package Week11;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stackList;
    private int topIndex;
    private int stackSize;

    public Stack(int size) {
        stackList = new ArrayList<T>(size);
        topIndex = -1;
        stackSize = size;
    }

    public void push(T value) {
        if (topIndex == stackSize - 1) {
            throw new IllegalStateException("Stack is full");
        } else {
            topIndex++;
            stackList.add(value);
        }
    }

    public T pop() {
        if (topIndex == -1) {
            throw new IllegalStateException("Stack is empty");
        } else {
            T value = stackList.get(topIndex);
            stackList.remove(topIndex);
            topIndex--;
            return value;
        }
    }

    public T peek() {
        if (topIndex == -1) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return stackList.get(topIndex);
        }
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == stackSize - 1;
    }
}
