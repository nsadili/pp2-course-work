package Week10;
import java.util.Arrays;

public class StackEnhanced<T> {
    private T[] stack;
    private int top;
    private int size;

    public StackEnhanced(int size) {
        this.size = size;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T element) {
        if (top == size - 1) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = element;
    }

    public T pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    public T peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackEnhanced<Integer> stack = new StackEnhanced<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        stack.print();
        stack.push(6);
        stack.print();
    }
}
