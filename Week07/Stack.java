
public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) throws Exception {
        // TODO what is capacity is not a positive integer ?
        if (capacity < 0)
            throw new Exception();
        else
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
        // TODO: what if the stack is empty? index == 1?
        if (elements[1] == 0)
            throw new Exception();

        return elements[index];
    }

    public int pop() throws Exception {
        // TODO: what if the stack is empty? index == -1?
        if (elements[-1] == 0)
            throw new Exception();
        else
            return elements[index--];
    }

    public void push(int el) throws Exception {
        // TODO: what if the stack is full? index == capacity-1?
        if (elements[index] == capacity - 1)
            throw new Exception();
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
        try {
            stack.pop();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        stack.push(200000);

        stack.__print();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}