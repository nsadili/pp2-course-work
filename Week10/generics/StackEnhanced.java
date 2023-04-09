package generics;

import java.util.LinkedList;
// Make this a generic stack
public class StackEnhanced {

    private LinkedList<Integer> stack;

    public StackEnhanced() {
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
        StackEnhanced myStack = new StackEnhanced();

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