package ex7;

public class Stack {
    private int arr[], top, capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int x) {
        if (this.isFull()) {
            throw new StackOverflowError("Stack is full.");
        }

        arr[++top] = x;
        System.out.println("Inserted " + x);
    }

    public int pop() throws StackIsEmptyError {
        if (this.isEmpty()) {
            throw new StackIsEmptyError("Stack is empty.");
        }

        return arr[top--];
    }

    public int peek() throws StackIsEmptyError {
        if (this.isEmpty()) {
            throw new StackIsEmptyError("Stack is empty.");
        }

        return arr[top];
    }

    public void printStack() {
        System.out.print("{");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
            if (i != top) System.out.print(", ");
            else System.out.println("}");
        }
    }
}
