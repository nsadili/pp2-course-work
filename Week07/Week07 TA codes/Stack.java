class EmptyStackException extends Exception {
    public EmptyStackException(String msg) {
        super(msg);
    }
}
class FullStackException extends Exception {
    public FullStackException(String msg) {
        super(msg);
    }
}
class IllegalCapacityException extends Exception {
    public IllegalCapacityException(String msg) {
        super(msg);
    }
}


public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        // TODO what if capacity is not a positive integer ?
        try {
            if(capacity <= 0) {
                throw new IllegalCapacityException("capacity must be a positive integer!");
            }
            this.capacity = capacity;
            this.index = -1;
            this.elements = new int[capacity];
        } catch (IllegalCapacityException e) {
            e.printStackTrace();
        }
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() {
        // TODO: what if the stack is empty? index == 1?
        try {
            if(isEmpty()) {
                throw new EmptyStackException("Your stack is empty!");
            }
            return elements[index];
        } catch(EmptyStackException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int pop() {
        // TODO: what if the stack is empty? index == -1?
        try {
            if(isEmpty()) {
                throw new EmptyStackException("Your stack is empty!");
            }
            return elements[index--];
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void push(int el) {
        // TODO: what if the stack is full? index == capacity-1?
        try {
            if(isFull()) {
                throw new FullStackException("Your stack is full!");
            }
            elements[++index] = el;
        } catch (FullStackException e) {
            e.printStackTrace();
        }
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

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        stack.push(200);
        // stack.push(200000);

        stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}