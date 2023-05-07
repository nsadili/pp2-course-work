import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(int num) {
        stack.addLast(num);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeLast();
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}