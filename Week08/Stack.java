import java.util.LinkedList;

public class Stack {

    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<Integer>();
    }

    public void push(int value) {
        stack.push(value);
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.size());

        System.out.println(myStack.peek());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
