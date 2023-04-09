package ex5;

public class Stack<T> {
    private T arr[];
    private int top, capacity;

    public Stack(int size) {
        arr = (T[]) new Object[size];
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

    public void push(T x) {
        if (this.isFull()) {
            throw new StackOverflowError("Stack is full.");
        }

        arr[++top] = x;
        System.out.println("Inserted " + x);
    }

    public T pop() throws StackIsEmptyError {
        if (this.isEmpty()) {
            throw new StackIsEmptyError("Stack is empty.");
        }

        return arr[top--];
    }

    public T peek() throws StackIsEmptyError {
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
