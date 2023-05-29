public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
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

    public int peek() {
        return elements[index];
    }

    public int pop() {

        return elements[index--];
    }

    public void push(int el) {

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


        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);

        stack.__print();

    }
}