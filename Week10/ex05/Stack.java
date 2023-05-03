package Week10.ex05;

public class Stack<T> {

    private final int MAX_SIZE;
    private int top;
    private T[] elements;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        MAX_SIZE = maxSize;
        top = -1;
        elements = (T[]) new Object[MAX_SIZE];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(T element) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        top++;
        elements[top] = element;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        T element = elements[top];
        top--;
        return element;
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return elements[top];
    }
}
