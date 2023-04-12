import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    // Adds an element to the top of the stack
    public void push(T value) {
        list.addFirst(value);
    }

    // Removes and returns the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    // Returns the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of elements in the stack
    public int size() {
        return list.size();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing 1, 2, and 3 to the stack...");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popping the top element...");
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Top element of the stack after pop: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());
    }
}
