import java.util.EmptyStackException;

public class GenericStack<T> {

    private int maxSize;
    private int top;
    private T[] stackArray;

    public GenericStack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = (T[]) new Object[maxSize];
    }

    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full!");
        }
        stackArray[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = stackArray[top];
        stackArray[top--] = null;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
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
