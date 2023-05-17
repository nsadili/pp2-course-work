public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowException("Stack is full. Cannot push new element.");
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot pop element.");
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Cannot peek element.");
        }
        return stackArray[top];
    }

    public void printStack() {
    }

    public void printStackk() {
    }

    public String size() {
        return null;
    }
}
