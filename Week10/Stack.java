package StackEnhanced;
public class Stack <T> {
    private T[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
      if(capacity < 0) throw new IllegalArgumentException("Capacity must be positive!!!");
        this.capacity = capacity;
        this.index = -1;
        this.elements = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public T peek() {
        // TODO: what if the stack is empty? index == 1?
           if(index == -1) throw new IllegalArgumentException("Stack is empty");
        return elements[index];
    }

    public T pop() {
        // TODO: what if the stack is empty? index == -1?
        if(index == -1) throw new IllegalArgumentException("Stack is empty");
        return elements[index--];
    }

    public  void push(T el) {
        // TODO: what if the stack is full? index == capacity-1?
         if(index == capacity - 1) throw new IllegalArgumentException("Capacity is full");
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
        Stack stack = new Stack(4);

        stack.push("Elnar");
        stack.push(4);
        stack.push('C');
        stack.push(true);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());

    }
}