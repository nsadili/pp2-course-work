public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        if (capacity < 0) 
        throw new IllegalArgumentException(String.format("%d is the capacity and it is negative.", capacity));
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

    public int peek() throws StackEmptyException {

        if (index == 1) {
            throw new StackEmptyException("The stack is empty!");
        }
        // TODO: what if the stack is empty? index == 1?

        return elements[index];
    }

    public int pop() throws StackEmptyException {

        if (index == -1) {
            throw new StackEmptyException("The stack is empty, therefore, cannot pop!");
        }
        // TODO: what if the stack is empty? index == -1?

        return elements[index--];
    }

    public void push(int el) throws StackEmptyException{

        if (el == capacity - 1) {
            throw new StackEmptyException("The stack is full, therefore, cannot push!");
        }
        // TODO: what if the stack is full? index == capacity-1?

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
        Stack stack = new Stack(5);
       
        // stack.pop();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        // stack.push(200000);

        stack.__print();
        
    } catch(IllegalArgumentException e) {
        System.out.println("Not valid capacity!\n" + e.getMessage());
    } catch(StackEmptyException s) {
        System.out.println("The operation cannot be executed!" + s.getMessage());

    }

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}