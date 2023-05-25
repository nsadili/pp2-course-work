public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer.");
        }
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("Cannot peek an empty stack.");
        }
        return elements[index];
    }

    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("Cannot pop from an empty stack.");
        }
        return elements[index--];
    }

    public void push(int el) throws FullStackException {
        if (isFull()) {
            throw new FullStackException("Cannot push to a full stack.");
        }
        elements[++index] = el;
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements[i]);
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        try {
            stack.push(3);
            stack.push(5);
            stack.push(7);
            stack.push(10);
            stack.push(100);
       
        } catch (FullStackException e) {
            System.out.println(e.getMessage());
        }

        stack.__print();

        try {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
     
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}

class EmptyStackException extends Exception {
    public EmptyStackException(String errorMessage) {
        super(errorMessage);
    }
}

class FullStackException extends Exception {
    public FullStackException(String errorMessage) {
        super(errorMessage);
    }
}
