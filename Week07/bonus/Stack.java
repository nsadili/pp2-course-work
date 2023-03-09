package Week07.bonus;

public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("Capacity of a stack cannot be less than one: " + capacity);
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
        if (this.isEmpty()) throw new EmptyStackException("peek() on an empty stack");
        return elements[index];
    }

    public int pop() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException("pop() on an empty stack");
        return elements[index--];
    }

    public void push(int el) throws FullStackException {
        if (this.isFull()) throw new FullStackException("push() on a full stack");
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
        try {
            Stack errStack = new Stack(-4);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        Stack stack = new Stack(5);

        try {
            stack.pop();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }

        try {
            stack.push(3);
            stack.push(5);
            stack.push(7);
            stack.push(10);
            stack.push(100);
            stack.push(200000);
        } catch (FullStackException e) {
            e.printStackTrace();
        }

        stack.__print();

        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (Exception e) {}
        }
    }
}
