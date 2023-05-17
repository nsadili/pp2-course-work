package Week08;
import java.util.LinkedList;

public class Stackk {
    private LinkedList<Integer> stack;

    public Stackk() {
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int value) {
        stack.push(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop element.");
        }
        return stack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek element.");
        }
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        Stackk stack = new Stackk();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        stack.printStackk();

        System.out.println("Size: " + stack.size());
    }

    private void printStackk() {
    }
}
