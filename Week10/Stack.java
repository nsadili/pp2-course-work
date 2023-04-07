package Week10;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();
    private int capacity;

    public Stack(int capacity) {
        this.stack = new ArrayList<>(capacity);
        this.capacity=capacity;
    }

    public void add(T el) {
        stack.add(el);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size()==capacity;
    }

    public T peek() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Cannot peek when stack is empty!");
        return stack.get(stack.size() - 1);
    }

    public T pop() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Cannot pop when stack is empty!");
        return stack.remove(stack.size() - 1);
    }

    public void push(T el) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("Cannot push when stack is empty!");
        stack.add(el);
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(" || " + stack.get(i));
        }
        System.out.println(" || Top");
    }
}
