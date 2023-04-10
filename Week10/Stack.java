public class Stack<T> {
    private T[] stackArray;
    private int top;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push new element.");
        }
        stackArray[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop an element.");
        }
        return stackArray[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek an element.");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
