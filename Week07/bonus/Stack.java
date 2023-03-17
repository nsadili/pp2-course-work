public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        if (capacity<0){
            throw new NegativeArraySizeException("You cannot write a negative number as a capacity!");
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

    public int peek() {
        if (this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack is empty, you cannot peek!");
        }

        return elements[index];
    }

    public int pop() {

        if (this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack is empty, you cannot pop!");
        }

        return elements[index--];
    }

    public void push(int el) {

        if (this.isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack is full, you cannot push!");
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
        Stack stack = new Stack(-5);
        // System.out.println(stack.peek());
        // stack.pop();

        stack.push(7);
        stack.push(5);
        
        stack.push(10);
        stack.push(200);
        stack.push(7);
        
        
        // stack.push(200000);

        stack.__print();
        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}