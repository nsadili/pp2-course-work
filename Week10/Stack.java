public class Stack<T> {
    private T[] elements;
    private int capacity;
    private int index;

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>(5);

        try {
            stack.push(3);
            stack.push(5);
            stack.push(7);
            stack.push(10);
            stack.push(100);
            // stack.push(200); //Throws an exception

            System.out.print("Stack after pushing: ");
            stack.__print();
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Stack after popping: ");
            stack.__print();

        } catch (StackExceptions e) {
            e.printStackTrace();
        }

    }

    public Stack(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
        index = -1;
    }

    public void push(T el) throws Exception {
        if (index == capacity - 1)
            throw new StackExceptions("Stack is full!");
        elements[++index] = el;
    }

    public T pop() throws StackExceptions {
        if (index == -1)
            throw new StackExceptions("Stack is empty!");
        else
            return elements[index--];
    }

    public T peek() throws Exception {
        if (index == -1)
            throw new StackExceptions();

        return elements[index];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
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

}