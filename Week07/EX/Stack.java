package EX;

public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) throws Exception {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity can not be a negative number or 0");
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

    public int peek() throws Exception {
        if (index == -1)
            throw new Exception("Stack is empty!");

        return elements[index];
    }

    public int pop() throws Exception {
        if (index == -1)
            throw new Exception("Stack is empty!");

        return elements[index--];
    }

    public void push(int el) throws Exception {
        if (index == capacity - 1)
            throw new Exception("Stack is full!");

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

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        do {
            try {
                stack.push(200000);
            }

            catch (Exception a) {
                System.out.println(a.getMessage());
            }

            try {
                stack.pop();
            } catch (Exception a) {
                System.out.println(a.getMessage());
            }
            break;
        } while (true);
        stack.__print();

    }
}