package Week10;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackEnhanced<T> {

    private List<T> stack = new ArrayList<>();
    private int maxSize;

    public StackEnhanced(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == maxSize;
    }

    public void push(T item) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException();
        }
        stack.add(item);
    }

    public T pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        T item = stack.remove(stack.size() - 1);
        return item;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        T item = stack.get(stack.size() - 1);
        return item;
    }

    public int size() {
        return stack.size();
    }

    public static class StackOverflowException extends Exception {
        public StackOverflowException() {
            super("Stack is full");
        }
    }

    public static class StackUnderflowException extends Exception {
        public StackUnderflowException() {
            super("Stack is empty");
        }
    }

    public static void main(String[] args) {
        StackEnhanced<String> stack = new StackEnhanced<>(5);
        try {
            stack.push("One");
            stack.push("Two");
            stack.push("Three");
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            stack.push("Four");
            stack.push("Five");
            stack.push("Six");
            stack.push("Seven");// this part will throw stackoverflow exception
            // because we declared max capacity to be 5
        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println(e);
        }
        StackEnhanced<String> stackTwo = new StackEnhanced<>(5);
        try{
            stackTwo.pop();
        } catch (StackUnderflowException e){
            System.out.println(e);
        }
    }
}
