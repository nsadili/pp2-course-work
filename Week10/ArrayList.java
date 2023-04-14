import java.util.ArrayList;

public class Stack<E> {
    private ArrayList<E> stack;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.stack = new ArrayList<>(capacity);
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(E element) throws StackFullException {
        if (isFull()) {
            throw new StackFullException("Stack is full");
        }
        stack.add(++top, element);
    }

    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stack.remove(top--);
    }

    public E peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
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

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
