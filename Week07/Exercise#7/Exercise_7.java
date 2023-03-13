public class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.data = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push new element.");
        }
        top++;
        data[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop element.");
        }
        int value = data[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek element.");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

//I've thrown an IllegalStateException with the uasage of specigical comments for two cases: 
//First case: empty stack
//Second case: push new element, while the stack is already full