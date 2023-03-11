
public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        if(capacity<=0) throw new IllegalArgumentException("Please, provide a valid capacity number");
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
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Cannot peek when stack is empty!");
        return elements[index];
    }

    public int pop() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Cannot pop when stack is empty!");
        return elements[index--];
    }

    public void push(int el) {
        if (isFull()) throw new ArrayIndexOutOfBoundsException("Cannot push when stack is empty!");
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

        // stack.pop();
        System.out.println("Stack is empty?: "+stack.isEmpty());
        System.out.println("Stack is full?: "+stack.isFull());

        System.out.println("Stack pop function when stack is empty: "+stack.pop());
        System.out.println("Peek function when stack is empty: "+stack.peek());
        stack.__print();        

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);

        stack.push(100);


        System.out.println("Peek function when stack is full: "+stack.peek());

        System.out.println("Stack is empty?: "+stack.isEmpty());
        System.out.println("Stack is full?: "+stack.isFull());

        stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        System.out.println("Stack pop function: "+stack.pop());
        System.out.println("Stack pop function: "+stack.pop());
        stack.__print();        

        


    }
}
