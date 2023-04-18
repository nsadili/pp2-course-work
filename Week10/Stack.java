public class Stack<L> {
    private L[] stackArray;
    private int top;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = (L[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(L value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push new element.");
        }
        stackArray[++top] = value;
    }

    public L pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop an element.");
        }
        return stackArray[top--];
    }

    public L peek() {
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